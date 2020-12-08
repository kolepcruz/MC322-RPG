package model.barbarian;

import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class TotemicBarbarian extends Barbarian{

    public TotemicBarbarian(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory, int rage) {
        super(atributos, combate, lvl, expPoints, inventory, rage);
    }

    public TotemicBarbarian() {
    }

    public int spiritTotem()
    {
        return doDamage(2,4,6,5);
    }
    public int totemicHarmony()
    {
        return doDamage(3,5,10,15);
    }
}
