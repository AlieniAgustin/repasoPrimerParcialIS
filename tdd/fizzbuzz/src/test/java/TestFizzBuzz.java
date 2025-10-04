import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {

  @Test 
  public void transformNormalNumber(){
    int n = 1; //arrange
    FizzBuzz fizzBuzz = new FizzBuzz(); //arrange 
    String transformedNumber = fizzBuzz.transformNumber(n); //act 
    assertEquals("1",transformedNumber); //assert 
  }

  @Test 
  public void transformFizzNumber(){
    int n = 6; //arrange 
    FizzBuzz fizzBuzz = new FizzBuzz(); //arrange 
    String transformedNumber = fizzBuzz.transformNumber(n); //act 
    assertEquals("Fizz",transformedNumber);
  }

  @Test 
  public void transformBuzzNumber(){
    int n = 10; //arrange 
    FizzBuzz fizzBuzz = new FizzBuzz(); //arrange 
    String transformedNumber = fizzBuzz.transformNumber(n); //act 
    assertEquals("Buzz",transformedNumber);
  }

  @Test 
  public void transformFizzBuzzNumber(){
    int n = 30; //arrange 
    FizzBuzz fizzBuzz = new FizzBuzz(); //arrange 
    String transformedNumber = fizzBuzz.transformNumber(n); //act 
    assertEquals("FizzBuzz",transformedNumber);
  }

  @Test 
  public void transformZero(){
    int n = 0; //arrange 
    FizzBuzz fizzBuzz = new FizzBuzz(); //arrange 
    Exception exception = assertThrows(IllegalArgumentException.class, () -> fizzBuzz.transformNumber(n)); //act y assert
  }

  @Test 
  public void transformNegativeNumber(){
    int n = -3; //arrange 
    FizzBuzz fizzBuzz = new FizzBuzz(); //arrange 
    Exception exception = assertThrows(IllegalArgumentException.class, () -> fizzBuzz.transformNumber(n)); //act y assert
  }
}
