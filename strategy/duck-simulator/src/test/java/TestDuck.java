import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDuck {

    @Test
    public void testMallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
    }

    @Test
    public void testModelDuckChangeFlyBehavior() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    @Test 
    public void testManyDucks(){
        Duck duck1 = new MallardDuck();
        duck1.performFly();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.performFly();

        Duck duck2 = new PatoCriollo();
        duck2.performFly();
        duck2.setFlyBehavior(new FlyNoWay());
        duck2.performFly();
    }
    
    @Test 
    public void testPatoPeronista(){
        Duck peron = new PatoPeronista();
        peron.performFly();
        peron.performQuack();
    }
}
