package players;

import behaviours.IWeapon;
import behaviours.Targetable;

public abstract class Player implements IWeapon, Targetable {

    private String name;
    private PlayerType playerType;
    private int health;


    public Player(String name, PlayerType playerType, int health) {
        this.name = name;
        this.playerType = playerType;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
