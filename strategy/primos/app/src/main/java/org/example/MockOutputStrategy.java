package org.example;

public class MockOutputStrategy implements OutputStrategy{

  private String output;

  public void output(String outputString){
    this.output = outputString;
  }

  public String getOutput(){
    return this.output;
  }

}
