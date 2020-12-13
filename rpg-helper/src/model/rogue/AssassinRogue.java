package model.rogue;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

public class AssassinRogue extends Rogue{

    public AssassinRogue(Attributes attributes, CombatAttributes combatAttributes, Inventory inventory, Person person, int level, int expPoints) {
        super(attributes, combatAttributes, inventory, person, level, expPoints);
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
