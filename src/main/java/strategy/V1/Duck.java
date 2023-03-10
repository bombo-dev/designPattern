package strategy.V1;

public abstract class Duck {

    protected void quick(){
        System.out.println("꽥꽥");
    }

    protected void swim() {
        System.out.println("수영 할 수 있습니다.");
    }
    abstract void display();
}
