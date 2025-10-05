package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactoryMethod {

    @Test
    public void testOrderNYPizza() {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }

    @Test
    public void testOrderChicagoPizza() {
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

    @Test
    public void testOrderArgentinaPizza() {
        PizzaStore argentinaStore = new ArgentinaPizzaStore();

        Pizza pizza = argentinaStore.orderPizza("cheese");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");

        pizza = argentinaStore.orderPizza("clam");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");

        pizza = argentinaStore.orderPizza("pepperoni");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");

        pizza = argentinaStore.orderPizza("veggie");
        System.out.println("Peron ordered a " + pizza.getName() + "\n");
    }
}
