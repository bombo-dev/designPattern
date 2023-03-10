package strategy.quiz;

public class Troll extends Character {

    public Troll(){
        weapon = new Axe();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
