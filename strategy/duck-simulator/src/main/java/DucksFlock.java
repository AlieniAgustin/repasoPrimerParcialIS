import java.util.List;
import java.util.ArrayList;

public class DucksFlock{

  private List<Duck> ducks;

  public DucksFlock(){
    ducks = new ArrayList<>();
  }

  public void addDuck(Duck duck){
    ducks.add(duck);
  }

  public void fly(){
    for(Duck duck : ducks)
      duck.performFly();
  }

  public void quack(){
    for(Duck duck : ducks)
      duck.performQuack();
  }

  public void simulate(){
    fly();
    quack();
  }
}
