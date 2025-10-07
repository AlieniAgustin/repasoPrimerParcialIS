package org.example;

import java.util.List;

public class TaskController implements Observer{

  private TaskManager model;
  private TaskView view;

  public TaskController(TaskManager model){
    this.model = model;
    this.model.addObserver(this);
    this.view = new TaskView(this.model,this);
  }

  public void update(List<Task> tasks){
    return;
  }

  public void addTask(String name){
    model.addTask(name);
  }

  public void removeTask(int id){
    model.removeTask(id);
  }

  public void markATaskAsComplete(int id){
    model.markATaskAsComplete(id);
  }

  //para testear y simular (no me voy a poner a hacer botones y esas weas, esta todo hardcodeado y simulando scanners y eso xd)
  public TaskView getView(){
    return view;
  }

}
