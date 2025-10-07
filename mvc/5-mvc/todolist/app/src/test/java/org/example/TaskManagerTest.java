package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest{

  @Test 
  public void addTasksTest(){
    TaskManager manager = new TaskManager();
    TaskController controller = new TaskController(manager);
    TaskView view = controller.getView();
    view.pressAddTaskButton("Sacar la basura");
    view.pressAddTaskButton("Cocinar");
    view.pressAddTaskButton("Limpiar la casa");
  }

  @Test 
  public void markATaskAsCompletedTest(){
    TaskManager manager = new TaskManager();
    TaskController controller = new TaskController(manager);
    TaskView view = controller.getView();
    view.pressAddTaskButton("Sacar la basura");
    view.pressAddTaskButton("Cocinar");
    view.pressMarkATaskAsCompletedButton(1);
  }


  @Test 
  public void removeTaskTest(){
    TaskManager manager = new TaskManager();
    TaskController controller = new TaskController(manager);
    TaskView view = controller.getView();
    view.pressAddTaskButton("Sacar la basura");
    view.pressAddTaskButton("Cocinar");
    view.pressAddTaskButton("Limpiar la casa");
    view.pressRemoveTaskButton(2);
    view.pressRemoveTaskButton(1);
  }


}
