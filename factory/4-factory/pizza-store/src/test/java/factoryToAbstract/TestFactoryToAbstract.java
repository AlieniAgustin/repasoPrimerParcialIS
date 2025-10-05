package factoryToAbstract;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactoryToAbstract {

    @Test
    public void testOrderNYPizza() {
        PizzaStore store = new PizzaStore(new NYPizzaFactory());

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }

    @Test
    public void testOrderChicagoPizza() {
        PizzaStore store = new PizzaStore(new ChicagoPizzaFactory());

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

    @Test
    public void testOrderArgentinaPizza() {
        PizzaStore store = new PizzaStore(new ArgentinaPizzaFactory());

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("clam");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("pepperoni");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");
    }
}
