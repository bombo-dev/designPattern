package strategy.quiz;

public class Axe implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("도끼를 사용하였습니다.");
    }
}
