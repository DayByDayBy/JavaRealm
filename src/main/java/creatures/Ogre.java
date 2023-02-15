package creatures;

import behaviours.IDefend;
import behaviours.Targetable;

public class Ogre implements IDefend, Targetable {
    private String name;
    private int health;
    private IDefend pummel;

    public Ogre(String name, int health, IDefend pummel) {
        this.name = name;
        this.health = health;
        this.pummel = pummel;


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

    public IDefend getPummel() {
        return pummel;
    }

    public void setPummel(IDefend pummel) {
        this.pummel = pummel;
    }
}
