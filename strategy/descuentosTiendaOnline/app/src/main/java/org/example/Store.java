package org.example;

import java.util.List;
import java.util.ArrayList;

public class Store{

  private List<Product> products;
  private double finalPrice;
  private Discount discount;

  public Store(Discount discount){
    this.products = new ArrayList<>();
    this.discount = discount;
  }

  public void addProduct(Product product){
    products.add(product);
  }

  public double getFinalPrice(){
    calculateFinalPrice();
    return finalPrice;
  }

  private void calculateFinalPrice(){
    double priceWithoutDiscounts = getPriceWithoutDiscounts();
    finalPrice = applyDiscount(priceWithoutDiscounts);
  }

  private double getPriceWithoutDiscounts(){
    double priceWithoutDiscounts = 0.0;

    for(Product product : products)
      priceWithoutDiscounts += product.getPrice();
    
    return priceWithoutDiscounts;
  }

  private double applyDiscount(double price){
    return discount.applyDiscount(price);
  }


}
