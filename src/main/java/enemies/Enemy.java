package enemies;

import behaviours.IWeapon;
import behaviours.Targetable;

public abstract class Enemy implements Targetable {
    private String name;
    private int health;
    private IWeapon weapon;

    public Enemy(String name, int health, IWeapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
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


}
