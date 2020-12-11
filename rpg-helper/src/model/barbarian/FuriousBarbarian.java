package model.barbarian;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class FuriousBarbarian extends Barbarian{

    public FuriousBarbarian(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory, int rage) {
        super(attributes, combat, lvl, expPoints, inventory, rage);
    }

    public FuriousBarbarian() {
    }

    public int retaliation()
    {
        return doDamage(1,8,10,35);
    }

    public int frenzy()
    {
        return doDamage(2,4,6,10);
    }

    public int berserker()
    {
        return doDamage(3,5,10,20);

    }

    public int intimidatingPresence()
    {
        return doDamage(4,8,10,35);
    }
}
