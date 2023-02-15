package players;

import behaviours.IWeapon;

public class Barbarian extends Fighter {
    private IWeapon weapon;
    public Barbarian(String name, PlayerType playerType, IWeapon weapon) {
        super(name, playerType);
        this.weapon = weapon;
    }
}
