package org.example;

public class LightThemeTextBox extends TextBox{

  public LightThemeTextBox(){
    this.typography = "calibri";
  }

  public String toString(){
    return "i'm a light theme text box, and my typography is " + this.typography;
  }

}
