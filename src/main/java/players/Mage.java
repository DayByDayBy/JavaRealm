package players;

import behaviours.ISpell;

public class Mage extends Player {

    private ISpell fireball;
    private ISpell lightningStrike;


    public Mage(String name, PlayerType playerType, ISpell fireball, ISpell lightningStrike) {
        super(name, playerType);
        this.fireball = fireball;
        this.lightningStrike = lightningStrike;


    }

    public ISpell getFireball() {
        return fireball;
    }

    public void setFireball(ISpell fireball) {
        this.fireball = fireball;
    }

    public ISpell getLightningStrike() {
        return lightningStrike;
    }

    public void setLightningStrike(ISpell lightningStrike) {
        this.lightningStrike = lightningStrike;
    }
}