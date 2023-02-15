package players;

import behaviours.IWeapon;
import behaviours.Targetable;
import weapons.WeaponType;

public abstract class Player implements Targetable {

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

    public int getHealth() {
        return health;
    }

    public  void setHealth(int health) {
        this.health = health;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }



}
