import behaviours.IWeapon;
import enemies.Enemy;
import enemies.Orc;
import healingKit.HealType;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Player;
import players.PlayerType;
import players.Wizard;
import players.Cleric;
import spells.SpellType;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;


public class PlayerTest {

    Player player;
    Enemy enemy;
    Cleric cleric;
    Wizard wizard;
    WeaponType weaponType;
    HealType healType;
    SpellType spellType;

    @Before
    public void setup(){
        player = new Knight("Sir Boglin", PlayerType.KNIGHT, WeaponType.SWORD, 200);
        enemy = new Orc("McCunto", 100, WeaponType.AXE);
//        wizard = new Wizard("Gamdalf", PlayerType.WIZARD, );
//        cleric = new Cleric("Dr.House", PlayerType.CLERIC, );
        };

    @Test
    public void playerHasName(){
        assertEquals("Sir Boglin", player.getName() );
    }

    @Test
    public void playerCanLoseHealth(){
        WeaponType.SWORD.getDamage();

    }

    }




