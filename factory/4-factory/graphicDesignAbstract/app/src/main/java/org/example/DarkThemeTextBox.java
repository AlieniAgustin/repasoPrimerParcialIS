package org.example;

public class DarkThemeTextBox extends TextBox{

  public DarkThemeTextBox(){
    this.typography = "arial";
  }

  public String toString(){
    return "i'm a dark theme text box, and my typography is " + this.typography;
  }

}
