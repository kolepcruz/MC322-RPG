package model.barbarian;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

public class FuriousBarbarian extends Barbarian{

    public FuriousBarbarian(Attributes attributes, CombatAttributes combatAttributes, Inventory inventory, Person person, int level, int expPoints, int rage) {
        super(attributes, combatAttributes, inventory, person, level, expPoints, rage);
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
