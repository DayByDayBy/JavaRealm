package players;

import behaviours.ISpell;
import behaviours.IWeapon;

public class Wizard extends Mage {

    public Wizard(String name, PlayerType playerType, ISpell fireball, ISpell lightningStrike) {
        super(name, playerType, fireball, lightningStrike);
    }
}