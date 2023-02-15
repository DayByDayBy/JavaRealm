package spells;

public class LightningStrike {

    private int lightningDamageValue;

    public LightningStrike (int lightningDamageValue){
        this.lightningDamageValue = lightningDamageValue;
    }

    public int getLightningDamageValue() {
        return lightningDamageValue;
    }

    public void setLightningDamageValue(int lightningDamageValue) {
        this.lightningDamageValue = lightningDamageValue;
    }
}
