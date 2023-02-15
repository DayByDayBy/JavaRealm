package enemies;

import behaviours.Targetable;
import players.Player;
import weapons.WeaponType;

public abstract class Enemy implements Targetable {
    private String name;
    private int health;
    private WeaponType weaponType;

    public Enemy(String name, int health, WeaponType weaponType) {
        this.name = name;
        this.health = health;
        this.weaponType = weaponType;
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

    public int attack(Player player) {
        player.setHealth(player.getHealth() - weaponType.getDamage());
        return player.getHealth();

    }




}
