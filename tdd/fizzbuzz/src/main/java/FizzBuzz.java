public class FizzBuzz {

  public FizzBuzz(){ }

  public String transformNumber(int n){
    if(n <= 0)
      throw new IllegalArgumentException();

    if(n % 15 == 0)
      return "FizzBuzz";
    else if(n % 3 == 0)
      return "Fizz";
    else if(n % 5 == 0)
      return "Buzz";
    else
      return "" + n;
  }

}
