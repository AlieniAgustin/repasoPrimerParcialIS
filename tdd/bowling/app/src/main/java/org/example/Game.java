package org.example;

import java.util.Map;
import java.util.HashMap;

public class Game {

  private int currentFrameNumber;
  private int currentFrameRolls;
  private Map<Integer,Frame> frames;

  public Game(){ 
    currentFrameNumber = 1;
    currentFrameRolls = 0;
    frames = new HashMap<>();
    
    for(int i = 1; i <= 10; i++)
      frames.put(i,new Frame());
  }

  public void roll(int pins){

    if(currentFrameNumber > 10)
      throw new IllegalArgumentException();
    

    if(pins < 0 || pins > 10)
      throw new IllegalArgumentException();

    Frame currentFrame = frames.get(currentFrameNumber);

    if(currentFrameRolls == 0){
      currentFrame.setFstPull(pins);

      //strike 
      if(currentFrame.getIsStrike()){
        currentFrameRolls = 0;
        currentFrameNumber++;
      }else{
        currentFrameRolls++;
      }
    }else{
      int fstPull = currentFrame.getFstPull();
      int maxPins = 10 - fstPull;

      if(pins > maxPins)
        throw new IllegalArgumentException();

      currentFrame.setSndPull(pins);
      currentFrameRolls = 0;
      currentFrameNumber++;
    }
  }

  public int getCurrentFrameNumber(){
    return currentFrameNumber;
  }

  public int score(){
    int finalScore = calculateScore();
    return finalScore;
  }

  private int calculateScore(){
    int sum = 0;
    
    for(int i = 1; i <= 10; i++){
      Frame currentFrame = frames.get(i);

      if(currentFrame.getIsStrike()){
        Frame nextFrame = frames.get(i+1);
        currentFrame.setBonus(nextFrame.getFstPull() + nextFrame.getSndPull());
      }

      if(currentFrame.getIsSpare()){
        Frame nextFrame = frames.get(i+1);
        currentFrame.setBonus(nextFrame.getFstPull());
      }
      sum += currentFrame.getFrameScore();
    }

    return sum;
  }

}
