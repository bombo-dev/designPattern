package strategy.V2;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        quick();
        swim();
        fly();
        System.out.println("MallardDuck 입니다.");
    }
}
