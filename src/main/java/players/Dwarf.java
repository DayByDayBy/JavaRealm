package players;

import behaviours.IWeapon;
import weapons.WeaponType;

public class Dwarf extends Fighter {

    private WeaponType weapon;
    public Dwarf(String name, PlayerType playerType, WeaponType weapon, int health) {
        super(name, playerType, health);
        this.weapon = weapon;
    }
}
