package strategy.quiz;

public abstract class Character {
    WeaponBehavior weapon;

    public Character(){}

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
}
