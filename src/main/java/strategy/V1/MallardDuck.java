package strategy.V1;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        quick();
        swim();
        System.out.println("MallardDuck 입니다.");
    }
}
