package model.barbarian;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class TotemicBarbarian extends Barbarian{

    public TotemicBarbarian(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory, int rage) {
        super(attributes, combat, lvl, expPoints, inventory, rage);
    }

    public TotemicBarbarian() {
    }

    public int totemicSpirit()
    {
        return doDamage(2,4,6,5);
    }
    public int totemicHarmony()
    {
        return doDamage(3,5,10,15);
    }
}
