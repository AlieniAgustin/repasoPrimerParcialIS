package org.example;

public class FixedAmountDiscount implements Discount{

  private double amountDiscount;

  public FixedAmountDiscount(double amountDiscount){
    this.amountDiscount = amountDiscount;
  }

  public double applyDiscount(double originalPrice){
    return originalPrice - amountDiscount;
  }

}
