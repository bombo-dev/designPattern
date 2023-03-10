package strategy.quiz;

public class King extends Character {

    public King(){
        weapon = new BowAndArrow();
    }
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
