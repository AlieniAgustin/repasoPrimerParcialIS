package org.example;

import java.util.List;

public class PrimeUtils {

  private List<Integer> primes;
  private PrimeGenerator primeGenerator;
  private OutputStrategy outputStrategy;
  private String outputString;

  public PrimeUtils(PrimeGenerator primeGenerator, OutputStrategy outputStrategy){
    this.primeGenerator = primeGenerator;
    this.outputStrategy = outputStrategy;
  }

  public void setPrimeGenerator(PrimeGenerator primeGenerator){
    this.primeGenerator = primeGenerator;
  }

  public void setOutputStrategy(OutputStrategy outputStrategy){
    this.outputStrategy = outputStrategy;
  }

  public void printFirstNPrimes(int n){
    if(n < 0)
      throw new IllegalArgumentException();
    else if(n == 0)
      outputString = "First 0 primes: \n";
    else{
      this.primes = this.primeGenerator.getFirstNPrimes(n);
      outputString = "First " + n + " primes: \n";

      for(int prime : this.primes)
        outputString += "" + prime + "\n";

      outputStrategy.output(outputString);
    }
  }
}
