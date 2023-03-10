package strategy.V3;

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        swim();
        System.out.println("레드 해드 덕입니다.");
    }

    @Override
    public void fly() {

    }
    @Override
    public void Quack() {

    }
}
