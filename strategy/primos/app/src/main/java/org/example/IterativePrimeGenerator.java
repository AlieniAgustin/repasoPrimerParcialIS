package org.example;

import java.util.List;
import java.util.ArrayList;

public class IterativePrimeGenerator implements PrimeGenerator{

  public IterativePrimeGenerator(){ }

  public List<Integer> getFirstNPrimes(int n){

    if(n == 0) return new ArrayList<>();

    if(n < 0) throw new IllegalArgumentException();

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
    if(n == 2) return true;

    if(n % 2 == 0) return false;

    for(int k = 3; k <= (int) Math.sqrt(n); k += 2)
      if(n % k == 0)
        return false;

    return true;
  }


}
