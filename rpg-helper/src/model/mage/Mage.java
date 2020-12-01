package model.mage;

import model.adv_tier.Adventurer;
import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;

public class Mage extends Adventurer {

    private int mana;

    public Mage(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        super(atributos, combate, lvl, expPoints, inventory);
    }

    public Mage() {
    }

    public int getMana() {
        return mana;
    }
}
