package strategy.V5;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓을 사용하여 날 수 있습니다.");
    }
}
