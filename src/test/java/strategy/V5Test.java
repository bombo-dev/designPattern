package strategy;

import org.junit.jupiter.api.Test;
import strategy.V5.Duck;
import strategy.V5.FlyRocketPowered;
import strategy.V5.MockDuck;

public class V5Test {

    @Test
    void dynamicDuck(){
        Duck duck = new MockDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        // 여기서 날수있도록 동적으로 변경
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
