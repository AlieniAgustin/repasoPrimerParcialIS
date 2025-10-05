package factoryToAbstract;

public class ChicagoPizzaFactory implements PizzaFactory {

  public CheesePizza createCheesePizza(){
    return new ChicagoStyleCheesePizza();
  }

  public ClamPizza createClamPizza(){
    return new ChicagoStyleClamPizza();
  }

  public PepperoniPizza createPepperoniPizza(){
    return new ChicagoStylePepperoniPizza();
  }

  public VeggiePizza createVeggiePizza(){
    return new ChicagoStyleVeggiePizza();
  }
}
