package strategy.V4;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    Duck(){}

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
}
