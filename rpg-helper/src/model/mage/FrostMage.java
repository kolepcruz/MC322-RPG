package model.mage;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

public class FrostMage extends Mage{

    public FrostMage(Attributes attributes, CombatAttributes combatAttributes, Inventory inventory, Person person, int level, int expPoints) {
        super(attributes, combatAttributes, inventory, person, level, expPoints);
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
