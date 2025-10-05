package factoryToAbstract;

public class NYPizzaFactory implements PizzaFactory {

  public CheesePizza createCheesePizza(){
    return new NYStyleCheesePizza();
  }

  public ClamPizza createClamPizza(){
    return new NYStyleClamPizza();
  }

  public PepperoniPizza createPepperoniPizza(){
    return new NYStylePepperoniPizza();
  }

  public VeggiePizza createVeggiePizza(){
    return new NYStyleVeggiePizza();
  }
}
