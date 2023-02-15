package players;

import behaviours.ISpell;
import behaviours.IWeapon;

public class Wizard extends Mage {

    public Wizard(String name, PlayerType playerType, ISpell lightningStrike) {
        super(name, playerType, lightningStrike);
    }
}