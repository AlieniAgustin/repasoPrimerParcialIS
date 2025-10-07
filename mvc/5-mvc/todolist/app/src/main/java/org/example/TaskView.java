package org.example;

import java.util.List;
import java.util.ArrayList;

public class TaskView implements Observer{

  private TaskManager model;
  private TaskController controller;
  private List<Task> tasks;


  public TaskView(TaskManager model, TaskController controller){
    this.model = model;
    this.controller = controller;
    this.model.addObserver(this);
    this.tasks = new ArrayList<>();
  }

  public void update(List<Task> tasks){
    this.tasks = tasks;
    display();
  }

  private void display(){
    String answer = "Tasks: \n";
    for(Task task : tasks)
      answer += task.toString();
    System.out.println(answer);
  }

  public void pressAddTaskButton(String name){
    controller.addTask(name);
  }

  public void pressRemoveTaskButton(int id){
    controller.removeTask(id);
  }

  public void pressMarkATaskAsCompletedButton(int id){
    controller.markATaskAsComplete(id);
  }

}
