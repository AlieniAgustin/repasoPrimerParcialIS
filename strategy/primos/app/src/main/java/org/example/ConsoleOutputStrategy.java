package org.example;

public class ConsoleOutputStrategy implements OutputStrategy{

  public void output(String outputString){
    System.out.println(outputString);
  }

}
