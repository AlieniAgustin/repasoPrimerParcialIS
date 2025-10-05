package factoryToAbstract;

public class PizzaStore {

  private PizzaFactory factory;

	public PizzaStore(PizzaFactory factory){
    this.factory = factory;
  }
 
	public Pizza orderPizza(String type) {

    Pizza pizza;

    if(type.equals("cheese"))
      pizza = orderCheesePizza();
    else if(type.equals("clam"))
      pizza = orderClamPizza();
    else if(type.equals("pepperoni"))
      pizza = orderPepperoniPizza();
    else if(type.equals("veggie"))
      pizza = orderVeggiePizza();
    else 
      pizza = null;

		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

  public Pizza orderCheesePizza(){
    return factory.createCheesePizza();
  }

   public Pizza orderClamPizza(){
    return factory.createClamPizza();
  } 

  public Pizza orderPepperoniPizza(){
    return factory.createPepperoniPizza();
  }

  public Pizza orderVeggiePizza(){
    return factory.createVeggiePizza();
  }

}
