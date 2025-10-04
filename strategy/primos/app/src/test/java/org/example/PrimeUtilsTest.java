package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeUtilsTest {

  @Test 
  public void firstPrime(){
    PrimeUtils primeUtils = new PrimeUtils();
    int n = 1;
    primeUtils.printFirstNPrimes(n);
  }

  @Test 
  public void firstFourPrimes(){
    PrimeUtils primeUtils = new PrimeUtils();
    int n = 4;
    primeUtils.printFirstNPrimes(n);
  }

  @Test 
  public void printNegativeNumberOfPrimes(){
    PrimeUtils primeUtils = new PrimeUtils();
    int n = -2;
    assertThrows(IllegalArgumentException.class, () -> primeUtils.printFirstNPrimes(n));
  }

  @Test 
  public void printNoPrime(){
    PrimeUtils primeUtils = new PrimeUtils();
    int n = 0;
    primeUtils.printFirstNPrimes(n);
  }

}
