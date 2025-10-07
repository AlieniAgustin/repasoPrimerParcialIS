package org.example;

public class RetroThemeVisualElementsFactory implements VisualElementsFactory{

  public RetroThemeVisualElementsFactory(){ }

  public Button createButton(){
    return new RetroThemeButton();
  }

  public Menu createMenu(){
    return new RetroThemeMenu();
  }

  public TextBox createTextBox(){
    return new RetroThemeTextBox();
  }

}
