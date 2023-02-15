package players;

import behaviours.IHeal;



public class Cleric extends Player {
    private IHeal herb;
    private IHeal potion;
    public Cleric(String name, PlayerType playerType, IHeal herb, IHeal potion, int health) {
        super(name, playerType, health);
        this.herb = herb;
        this.potion = potion;
    }

}
