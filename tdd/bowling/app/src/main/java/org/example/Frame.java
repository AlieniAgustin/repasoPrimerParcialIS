package org.example;

public class Frame{
  private int fstPull;
  private int sndPull;
  private int bonus;
  private boolean isSpare;
  private boolean isStrike;

  public Frame(){ 
    fstPull = 0;
    sndPull = 0;
    bonus = 0;
    isSpare = false;
    isStrike = false;
  }

  public int getFstPull(){
    return fstPull;
  }

  public int getSndPull(){
    return fstPull;
  }

  public int getBonus(){
    return bonus;
  }

  public void setFstPull(int fstPull){
    this.fstPull = fstPull;
  }

  public void setSndPull(int sndPull){
    this.sndPull = sndPull;
    
    if(this.fstPull + this.sndPull == 10)
      this.isSpare = true;
  }

  public void setBonus(int bonus){
    this.bonus = bonus;
  }

  public int getFrameScore(){
    return fstPull + sndPull + bonus;
  }

  public boolean getIsSpare(){
    return isSpare;
  }

  public boolean getIsStrike(){
    return isStrike;
  }
}
