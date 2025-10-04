package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
  
  @Test 
  public void makeThreeNormalRolls(){
    Game game = new Game();
    
    //1st frame
    game.roll(2);
    game.roll(3);

    //2nd frame
    game.roll(7);

    int currentFrameNumber = game.getCurrentFrameNumber();

    assertEquals(2,currentFrameNumber);
  }

  @Test 
  public void makeFourNormalRolls(){
    Game game = new Game();

    //1st frame
    game.roll(2);
    game.roll(3);

    //2nd frame
    game.roll(7);
    game.roll(2);

    int currentFrameNumber = game.getCurrentFrameNumber();

    assertEquals(3,currentFrameNumber);   
  }

  @Test 
  public void makeIllegalRoll(){
    Game game = new Game();

    assertThrows(IllegalArgumentException.class, () -> game.roll(11));
    assertThrows(IllegalArgumentException.class, () -> game.roll(-1));
  }

  @Test 
  public void makeARollWithNonExistentPins(){
    Game game = new Game();

    //1st frame 
    game.roll(8);
    assertThrows(IllegalArgumentException.class, () -> game.roll(3)); //ya que como maximo debo poder tirar 2
  }

  @Test 
  public void endGame(){
    Game game = new Game();

    //1st frame 
    game.roll(2);
    game.roll(2);

    //2nd frame 
    game.roll(2);
    game.roll(2);

    //3rd frame 
    game.roll(2);
    game.roll(2);

    //4th frame 
    game.roll(2);
    game.roll(2);

    //5th frame 
    game.roll(2);
    game.roll(2);

    //6th frame 
    game.roll(2);
    game.roll(2);

    //7th frame 
    game.roll(2);
    game.roll(2);

    //8th frame 
    game.roll(2);
    game.roll(2);

    //9th frame 
    game.roll(2);
    game.roll(2);

    //10th frame 
    game.roll(2);
    game.roll(2);

    assertThrows(IllegalArgumentException.class, () -> game.roll(3));
  }

  @Test 
  public void scoreOfTwoNormalRolls(){
    Game game = new Game();

    //1st frame 
    game.roll(3);
    game.roll(6);

    //2nd frame 
    game.roll(2);
    game.roll(4);

    int currentScore = game.score();
    assertEquals(15,currentScore);
  }
}
