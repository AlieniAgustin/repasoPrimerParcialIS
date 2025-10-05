package factorymethod;

public class ArgentinaPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ArgentinaStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ArgentinaStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ArgentinaStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ArgentinaStylePepperoniPizza();
        	} else return null;
	}
}
