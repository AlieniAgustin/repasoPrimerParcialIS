package org.example;

import java.util.List;
import java.util.ArrayList;

public class PrimeUtils {

  private List<Integer> primes;
  private PrimeGenerator primeGenerator;

  public PrimeUtils(PrimeGenerator primeGenerator){ 
    this.primeGenerator = primeGenerator;
  }

  public void setPrimeGenerator(PrimeGenerator primeGenerator){
    this.primeGenerator = primeGenerator;
  }

  public void printFirstNPrimes(int n){
    if(n < 0)
      throw new IllegalArgumentException();
    else if(n == 0)
      System.out.println("");
    else{
      this.primes = this.primeGenerator.getFirstNPrimes(n);

      for(int prime : this.primes)
        System.out.println(prime);
    }
  }
}
