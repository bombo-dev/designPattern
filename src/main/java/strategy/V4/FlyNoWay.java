package strategy.V4;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날 수 없습니다.");
    }
}
