package org.example;

public class DarkThemeVisualElementsFactory implements VisualElementsFactory{

  public DarkThemeVisualElementsFactory(){ }

  public Button createButton(){
    return new DarkThemeButton();
  }

  public Menu createMenu(){
    return new DarkThemeMenu();
  }

  public TextBox createTextBox(){
    return new DarkThemeTextBox();
  }

}
