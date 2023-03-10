package strategy.V1;

public class RedheadDuck extends Duck {
    @Override
    public void display() {
        quick();
        swim();
        System.out.println("레드 해드 덕입니다.");
    }
}
