package weapons;

public enum WeaponType {

    SWORD(20),
    AXE(10),
    CLUB(5);


    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
