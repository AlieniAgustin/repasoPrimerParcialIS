package org.example;

import java.util.List;
import java.util.ArrayList;

public class RecursivePrimeGenerator implements PrimeGenerator{

  public RecursivePrimeGenerator(){ }

  public List<Integer> getFirstNPrimes(int n){

    if(n == 0) return new ArrayList<>();

    if(n < 0) throw new IllegalArgumentException();

    List<Integer> primes = new ArrayList<>();
    int primeCounter = 1;
    primes.add(2);
    int currentNumber = 3;

    getFirstNPrimes(primes, n,primeCounter,currentNumber);
    return primes;
  }

  private void getFirstNPrimes(List<Integer> primes, int n, int primeCounter, int currentNumber){
    if(primeCounter == n) return;

    if(isPrime(currentNumber)){
      primes.add(currentNumber);
      primeCounter++;
    }

    getFirstNPrimes(primes,n,primeCounter,currentNumber+2);
  }

  private boolean isPrime(int n){
    if(n == 2) return true;

    if(n % 2 == 0) return false;

    return isPrime(n,3);
  }

  private boolean isPrime(int n, int m){
    if(m > (int) Math.sqrt(n)) return true;

    if(n % m == 0) return false;

    return isPrime(n,m+2);
  }


}
