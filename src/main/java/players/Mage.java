package players;

import behaviours.ISpell;

public class Mage extends Player {

    private ISpell spell;


    public Mage(String name, PlayerType playerType, ISpell spell, int health) {
        super(name, playerType, health);
        this.spell = spell;


    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    @Override
    public int attack() {
        return 0;
    }
}