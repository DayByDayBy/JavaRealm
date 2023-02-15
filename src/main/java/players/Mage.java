package players;

import behaviours.ISpell;
import spells.SpellType;

public class Mage extends Player {

    private SpellType spellType;


    public Mage(String name, PlayerType playerType, SpellType spellType, int health) {
        super(name, playerType, health);
        this.spellType = spellType;


    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }
}


