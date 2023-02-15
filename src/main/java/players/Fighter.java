package players;

import behaviours.IWeapon;

public class Fighter extends Player implements IWeapon {


    public Fighter(String name, PlayerType playerType, int health) {
        super(name, playerType, health);
    }

    @Override
    public int attack() {
        return 0;
    }
}
