package model.rogue;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class AssassinRogue extends Rogue{

    public AssassinRogue(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
    }

    public AssassinRogue() {
    }

    public int assassinate()
    {
        return doDamage(2,4,6,10);
    }

    public int fatalBlow()
    {
        return doDamage(3,5,10,20);
    }
}
