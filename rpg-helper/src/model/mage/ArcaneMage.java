package model.mage;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

public class ArcaneMage extends Mage{

    public ArcaneMage(Attributes attributes, CombatAttributes combatAttributes, Inventory inventory, Person person, int level, int expPoints) {
        super(attributes, combatAttributes, inventory, person, level, expPoints);
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
