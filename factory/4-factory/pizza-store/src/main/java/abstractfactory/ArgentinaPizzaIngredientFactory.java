package abstractfactory;

public class ArgentinaPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ArgentineDough();
	}

	public Sauce createSauce() {
		return new ArgentineSauce();
	}

	public Cheese createCheese() {
		return new ArgentineCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Rucula()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new ArgentinePepperoni();
	}

	public Clams createClam() {
		return new ArgentineClams();
	}
}
