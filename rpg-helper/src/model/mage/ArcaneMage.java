package model.mage;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class ArcaneMage extends Mage{

    public ArcaneMage(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
    }

    public ArcaneMage() {
    }

    public int arcaneArmor()
    {
        return doDamage(1,4,4,8);
    }

    public int magicMissiles()
    {
        return doDamage(2,6,6,18);
    }

    public int prismaticBarrage()
    {
        return doDamage(3,10,10,28);
    }

    public int arcanePortal()
    {
        return doDamage(4,10,6,22);
    }
}
