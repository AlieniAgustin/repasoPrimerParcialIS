package org.example;

import java.util.List;
import java.util.ArrayList;

public class TaskManager implements Model{

  private List<Observer> observers;
  private List<Task> tasks;

  public TaskManager(){
    observers = new ArrayList<>();
    tasks = new ArrayList<>();
  }

  public void addTask(String name){
    int id = tasks.size() + 1;
    Task task = new Task(id,name);
    tasks.add(task);
    notifyObservers();
  }

  public void removeTask(int id){
    tasks.remove(id - 1);
    notifyObservers();
  }

  public void markATaskAsComplete(int id){
    Task task = tasks.get(id - 1);
    task.setIsFinished(true);
    notifyObservers();
  }

  public void addObserver(Observer o){
    observers.add(o);
  }

  public void removeObserver(Observer o){
    observers.remove(o);
  }

  public void notifyObservers(){
    for(Observer o : observers)
      o.update(tasks);
  }

}
