package strategy.quiz;

public class Queen extends Character {

    public Queen(){
        weapon = new Knife();
    }
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
