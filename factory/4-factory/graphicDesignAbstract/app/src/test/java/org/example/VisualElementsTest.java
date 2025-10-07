package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisualElementsTest{

  @Test 
  public void DarkThemeVisualElementsTest(){
    VisualElementsFactory darkThemeFactory = new DarkThemeVisualElementsFactory();

    Button darkThemeButton = darkThemeFactory.createButton();
    System.out.println(darkThemeButton);

    Menu darkThemeMenu = darkThemeFactory.createMenu();
    System.out.println(darkThemeMenu);

    TextBox darkThemeTextBox = darkThemeFactory.createTextBox();
    System.out.println(darkThemeTextBox);
  }

  @Test 
  public void LightThemeVisualElementsTest(){
    VisualElementsFactory lightThemeFactory = new LightThemeVisualElementsFactory();

    Button lightThemeButton = lightThemeFactory.createButton();
    System.out.println(lightThemeButton);

    Menu lightThemeMenu = lightThemeFactory.createMenu();
    System.out.println(lightThemeMenu);

    TextBox lightThemeTextBox = lightThemeFactory.createTextBox();
    System.out.println(lightThemeTextBox);
  }

  @Test 
  public void RetroThemeVisualElementsTest(){
    VisualElementsFactory retroThemeFactory = new RetroThemeVisualElementsFactory();

    Button retroThemeButton = retroThemeFactory.createButton();
    System.out.println(retroThemeButton);

    Menu retroThemeMenu = retroThemeFactory.createMenu();
    System.out.println(retroThemeMenu);

    TextBox retroThemeTextBox = retroThemeFactory.createTextBox();
    System.out.println(retroThemeTextBox);
  }

}
