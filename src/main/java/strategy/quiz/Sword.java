package strategy.quiz;

public class Sword implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("검을 사용하였습니다.");
    }
}
