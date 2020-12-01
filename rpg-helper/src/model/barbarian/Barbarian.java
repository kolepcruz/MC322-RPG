package model.barbarian;

import model.adv_tier.Adventurer;
import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;

public class Barbarian extends Adventurer {

    private int rage;

    public Barbarian(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory, int rage) {
        super(atributos, combate, lvl, expPoints, inventory);
        this.rage = rage;
    }

    public Barbarian() {
    }

    public int getRage() {
        return rage;
    }
}
