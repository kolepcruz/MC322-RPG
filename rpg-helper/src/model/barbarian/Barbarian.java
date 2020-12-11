package model.barbarian;

import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;

public class Barbarian extends Adventurer {

    private int rage;

    public Barbarian(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory, int rage) {
        super(attributes, combat, lvl, expPoints, inventory);
        this.rage = rage;
    }

    public Barbarian() {
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }
}
