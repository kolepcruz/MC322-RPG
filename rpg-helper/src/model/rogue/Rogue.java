package model.rogue;

import model.adv_tier.Adventurer;
import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;

public class Rogue extends Adventurer {

    private int stamina;

    public Rogue(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        super(atributos, combate, lvl, expPoints, inventory);
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
