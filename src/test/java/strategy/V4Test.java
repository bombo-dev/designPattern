package strategy;

import org.junit.jupiter.api.Test;
import strategy.V4.MallardDuck;

public class V4Test {

    @Test
    void performDuck(){

        MallardDuck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
