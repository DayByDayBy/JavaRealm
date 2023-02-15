package spells;

public enum SpellType {

    FIREBALL(20),
    LIGHTNING_STRIKE(10);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}