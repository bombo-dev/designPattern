package strategy.V3;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        swim();
        System.out.println("MallardDuck 입니다.");
    }

    @Override
    public void fly() {

    }
    @Override
    public void Quack() {

    }
}
