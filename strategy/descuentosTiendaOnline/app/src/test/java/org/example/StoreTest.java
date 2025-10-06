package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

  @Test 
  public void StoreWithouthDiscount(){
    //arrange
    Store store = new Store(new WithoutDiscount());
    store.addProduct(new Product("a","1",2.5));
    store.addProduct(new Product("b","2",3.5));
    store.addProduct(new Product("c","3",4.0));
   
    //act 
    double finalPrice = store.getFinalPrice();

    //assert 
    assertEquals(10.0,finalPrice);
  }

  @Test 
  public void StoreWithFixedAmountDiscount(){
    //arrange
    Store store = new Store(new FixedAmountDiscount(5));
    store.addProduct(new Product("a","1",2.5));
    store.addProduct(new Product("b","2",3.5));
    store.addProduct(new Product("c","3",4.0));
   
    //act 
    double finalPrice = store.getFinalPrice();

    //assert 
    assertEquals(5.0,finalPrice);
  }

  @Test 
  public void StoreWithPercentageDiscount(){
    //arrange
    Store store = new Store(new PercentageDiscount(0.25));
    store.addProduct(new Product("a","1",2.5));
    store.addProduct(new Product("b","2",3.5));
    store.addProduct(new Product("c","3",4.0));
   
    //act 
    double finalPrice = store.getFinalPrice();

    //assert 
    assertEquals(7.5,finalPrice);
  }

}
