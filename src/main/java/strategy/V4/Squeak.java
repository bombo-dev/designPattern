package strategy.V4;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("뀍 소리를 냅니다.");
    }
}
