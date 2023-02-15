package players;

import behaviours.IWeapon;
import weapons.WeaponType;

public class Knight extends Fighter {

    private int health;
    private WeaponType weapon;
        public Knight(String name, PlayerType playerType, WeaponType weapon, int health) {
            super(name, playerType, health);
            this.weapon = weapon;
        }

    public int attack(Player player) {
        player.setHealth(player.getHealth() - weapon.getDamage());
        return player.getHealth();

    }


}
