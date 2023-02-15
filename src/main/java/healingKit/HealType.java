package healingKit;

public enum HealType {

        HERB(10),
        POTION(20);

        private final int heal;

        HealType(int heal){
            this.heal = heal;
        }

    public int getHeal() {
        return heal;
    }
}

