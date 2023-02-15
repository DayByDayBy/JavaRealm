package players;

import behaviours.IHeal;
import healingKit.HealType;


public class Cleric extends Player {
    private HealType herb;
    private HealType potion;

    public Cleric(String name, PlayerType playerType, HealType herb, HealType potion, int health) {
        super(name, playerType, health);
        this.herb = herb;
        this.potion = potion;
    }

}
