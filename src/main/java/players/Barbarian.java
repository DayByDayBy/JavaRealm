package players;

import behaviours.IWeapon;
import weapons.WeaponType;

public class Barbarian extends Fighter {
    private WeaponType weapon;


    public Barbarian(String name, PlayerType playerType, WeaponType weapon, int health) {
        super(name, playerType, health);
        this.weapon = weapon;
    }
}
