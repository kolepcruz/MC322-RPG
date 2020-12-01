package model.barbarian;

import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;

public class FuriousBarbarian extends Barbarian{

    public FuriousBarbarian(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory, int rage) {
        super(atributos, combate, lvl, expPoints, inventory, rage);
    }

    public FuriousBarbarian() {
    }
}
