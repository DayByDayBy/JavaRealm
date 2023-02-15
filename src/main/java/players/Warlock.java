package players;

import behaviours.ISpell;
import behaviours.IWeapon;

public class Warlock extends Mage {

    public Warlock(String name, PlayerType playerType, ISpell fireball) {
        super(name, playerType, fireball, fireball);
    }
}
