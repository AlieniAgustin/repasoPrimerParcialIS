package org.example;

public class PercentageDiscount implements Discount{

  private double percentage;

  public PercentageDiscount(double percentage){
    this.percentage = percentage;
  }

  public double applyDiscount(double originalPrice){
    return originalPrice - (originalPrice * percentage);
  }

}
