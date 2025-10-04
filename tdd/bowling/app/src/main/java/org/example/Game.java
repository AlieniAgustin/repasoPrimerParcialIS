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
      currentFrameRolls++;
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

}
