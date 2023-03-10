package strategy.V5;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥 소리를 냅니다.");
    }
}
