package org.example;

public class Task{

  private int id; //supongo son unicos
  private String name;
  private boolean isFinished;

  public Task(int id, String name){
    this.isFinished = false;
    this.name = name;
    this.id = id;
  }

  public String toString(){
    String answer = "Task #" + id + ": " + name + ". Status: ";

    if(isFinished)
      answer += "completed\n";
    else 
      answer += "incompleted\n";

    return answer;
  }

  public void setIsFinished(boolean isFinished){
    this.isFinished = isFinished;
  }

}
