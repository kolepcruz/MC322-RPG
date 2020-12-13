package model.mage;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class ArcaneMage extends Mage{

    public ArcaneMage(Attributes attributes, Combat combat, Inventory inventory, Person person, int level, int expPoints) {
        super(attributes, combat, inventory, person, level, expPoints);
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
