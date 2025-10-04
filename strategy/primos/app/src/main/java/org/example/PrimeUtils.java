package org.example;

import java.util.List;
import java.util.ArrayList;

public class PrimeUtils {

  private List<Integer> primes;

  public PrimeUtils(){ }

  public void printFirstNPrimes(int n){
    if(n < 0)
      throw new IllegalArgumentException();
    else if(n == 0)
      System.out.println("");
    else{
      this.primes = getFirstNPrimes(n);

      for(int prime : this.primes)
        System.out.println(prime);
    }
  }

  private List<Integer> getFirstNPrimes(int n){
    List<Integer> primes = new ArrayList<>();
    int primeCounter = 1;
    primes.add(2);
    int currentNumber = 3;
    
    while(primeCounter < n){
      if(isPrime(currentNumber)){
        primes.add(currentNumber);
        primeCounter++;
      }

      currentNumber += 2;
    }

    return primes;
  }

  private boolean isPrime(int n){
    for(int k = 3; k <= (int) Math.sqrt(n); k += 2)
      if(n % k == 0)
        return false;

    return true;
  }

}
