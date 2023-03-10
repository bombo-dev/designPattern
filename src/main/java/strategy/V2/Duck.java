package strategy.V2;

public abstract class Duck {

    protected void quick(){
        System.out.println("꽥꽥");
    }

    protected void swim() {
        System.out.println("수영 할 수 있습니다.");
    }

    // 기획의 변경 요청
    protected void fly() {
        System.out.println("날 수 있습니다.");
    }
    abstract void display();
}
