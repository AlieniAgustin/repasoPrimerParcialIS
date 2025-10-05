package factoryToAbstract;

public interface PizzaFactory{
  
  public CheesePizza createCheesePizza();

  public ClamPizza createClamPizza();

  public PepperoniPizza createPepperoniPizza();

  public VeggiePizza createVeggiePizza();

}
