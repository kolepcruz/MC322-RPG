package model.mage;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class FrostMage extends Mage{

    public FrostMage(Attributes attributes, Combat combat, Inventory inventory, Person person, int level, int expPoints) {
        super(attributes, combat, inventory, person, level, expPoints);
    }

    public FrostMage() {
    }

    public int iceBeam()
    {
        return doDamage(1,3,4,5);
    }

    public int iceStorm()
    {
        return doDamage(2,4,6,10);
    }

    public int otilukeFreezingSphere()
    {
        return doDamage(3,5,10,20);
    }

    public int frostIcicle()
    {
        return doDamage(4,8,10,35);
    }
}
