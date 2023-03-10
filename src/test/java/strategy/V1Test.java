package strategy;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import strategy.V1.MallardDuck;
import strategy.V1.RedheadDuck;

import java.util.logging.Logger;


public class V1Test {

    Logger log = (Logger) LoggerFactory.getLogger(V1Test.class);

    @Test
    void V1() throws Exception {
        //given
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        //when

        //then
        mallardDuck.display();
        redheadDuck.display();
    }

}
