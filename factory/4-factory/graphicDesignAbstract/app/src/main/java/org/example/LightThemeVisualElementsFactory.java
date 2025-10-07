package org.example;

public class LightThemeVisualElementsFactory implements VisualElementsFactory{

  public LightThemeVisualElementsFactory(){ }

  public Button createButton(){
    return new LightThemeButton();
  }

  public Menu createMenu(){
    return new LightThemeMenu();
  }

  public TextBox createTextBox(){
    return new LightThemeTextBox();
  }

}
