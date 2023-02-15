package players;

import behaviours.ISpell;
import behaviours.IWeapon;

public class Warlock extends Mage {

    public Warlock(String name, PlayerType playerType, ISpell fireball, int health) {
        super(name, playerType, fireball, health);
    }


}
