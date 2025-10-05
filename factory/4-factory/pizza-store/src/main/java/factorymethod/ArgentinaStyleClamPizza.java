package factorymethod;

public class ArgentinaStyleClamPizza extends Pizza {
	public ArgentinaStyleClamPizza() {
		name = "Argentina Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
