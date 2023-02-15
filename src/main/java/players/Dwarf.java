package players;

import behaviours.IWeapon;

public class Dwarf extends Fighter {

    private IWeapon weapon;
    public Dwarf(String name, PlayerType playerType, IWeapon weapon) {
        super(name, playerType);
        this.weapon = weapon;
    }
}
