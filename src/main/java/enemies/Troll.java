package enemies;

import behaviours.IWeapon;
import weapons.WeaponType;

public class Troll extends Enemy {
    public Troll(String name, int health, WeaponType weaponType) {
        super(name, health, weaponType);
    }
}
