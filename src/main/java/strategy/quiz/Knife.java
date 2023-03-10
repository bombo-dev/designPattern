package strategy.quiz;

public class Knife implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("칼을 사용하였습니다.");
    }
}
