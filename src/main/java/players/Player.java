package players;


import java.util.ArrayList;

public abstract class Player {

    private String name;
    private PlayerType playerType;


    public Player(String name, PlayerType playerType) {
        this.name = name;
        this.playerType = playerType;
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
