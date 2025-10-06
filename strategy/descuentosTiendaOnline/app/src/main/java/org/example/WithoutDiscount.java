package org.example;

public class WithoutDiscount implements Discount{

  public WithoutDiscount(){ }

  public double applyDiscount(double originalPrice){
    return originalPrice;
  }

}
