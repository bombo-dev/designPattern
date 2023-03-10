package strategy.V5;

public class MockDuck extends Duck {

    public MockDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("모형의 오리입니다.");
    }
}
