package strategy.quiz;

public class BowAndArrow implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("활을 사용하였습니다.");
    }
}
