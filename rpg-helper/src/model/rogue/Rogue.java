package model.rogue;

import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;

public class Rogue extends Adventurer {

    private int stamina;

    public Rogue(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
        this.stamina = 15;
    }

    public Rogue() {
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
