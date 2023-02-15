package players;

public class Fighter extends Player {


    public Fighter(String name, PlayerType playerType, int health) {
        super(name, playerType, health);
    }

    @Override
    public int attack() {
        return 0;
    }
}
