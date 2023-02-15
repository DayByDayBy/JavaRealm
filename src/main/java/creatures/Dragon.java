package creatures;

import behaviours.IDefend;
import behaviours.Targetable;

public class Dragon implements IDefend, Targetable {
    private String name;
    private int health;
    private IDefend fire;

    public Dragon(String name, int health, IDefend fire) {
        this.name = name;
        this.health = health;
        this.fire = fire;


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

    public void setHealth(int health) {
        this.health = health;
    }

    public IDefend getFire() {
        return fire;
    }

    public void setFire(IDefend fire) {
        this.fire = fire;
    }

    @Override
    public int defend() {
        return 0;
    }
}
