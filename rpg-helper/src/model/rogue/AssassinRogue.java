package model.rogue;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class AssassinRogue extends Rogue{

    public AssassinRogue(Attributes attributes, Combat combat, Inventory inventory, Person person, int level, int expPoints) {
        super(attributes, combat, inventory, person, level, expPoints);
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
