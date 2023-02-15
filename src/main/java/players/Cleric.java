import behaviours.IHeal;
import players.Player;
import players.PlayerType;


public class Cleric extends Player {
    private IHeal herb;
    private IHeal potion;
    public Cleric(String name, PlayerType playerType, IHeal herb, IHeal potion) {
        super(name, playerType);
        this.herb = herb;
        this.potion = potion;
    }

}
