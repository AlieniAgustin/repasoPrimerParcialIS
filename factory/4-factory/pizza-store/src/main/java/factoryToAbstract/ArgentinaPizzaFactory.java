package factoryToAbstract;

public class ArgentinaPizzaFactory implements PizzaFactory {

  public CheesePizza createCheesePizza(){
    return new ArgentinaStyleCheesePizza();
  }

  public ClamPizza createClamPizza(){
    return new ArgentinaStyleClamPizza();
  }

  public PepperoniPizza createPepperoniPizza(){
    return new ArgentinaStylePepperoniPizza();
  }

  public VeggiePizza createVeggiePizza(){
    return new ArgentinaStyleVeggiePizza();
  }
}
