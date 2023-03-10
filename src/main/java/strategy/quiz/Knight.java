package strategy.quiz;

public class Knight extends Character {

    public Knight(){
        weapon = new Sword();
    }
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
