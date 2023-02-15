package players;

import behaviours.IWeapon;

public class Knight extends Fighter {

        private IWeapon weapon;
        public Knight(String name, PlayerType playerType, IWeapon weapon) {
            super(name, playerType);
            this.weapon = weapon;
        }

    }
