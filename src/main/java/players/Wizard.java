package players;

import behaviours.ISpell;
import behaviours.IWeapon;
import spells.SpellType;

public class Wizard extends Mage {

    public Wizard(String name, PlayerType playerType, SpellType spellType,  int health) {
        super(name, playerType, spellType, health);
    }
}