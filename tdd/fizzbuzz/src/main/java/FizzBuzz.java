public class FizzBuzz {

  public FizzBuzz(){ }

  public String transformNumber(int n){
    if(n <= 0)
      throw new IllegalArgumentException();

    String answer = "";
    String numberToString = String.valueOf(n);

    if(numberToString.contains("3"))
      answer += "Fizz";
    if(n % 3 == 0)
      answer += "Fizz";

    if(numberToString.contains("5"))
      answer += "Buzz";
    if(n % 5 == 0)
      answer += "Buzz";

    if(answer.isEmpty())
      answer = numberToString;

    return answer;
  }

}
