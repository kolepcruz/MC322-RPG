package model.barbarian;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

public class TotemicBarbarian extends Barbarian{

    public TotemicBarbarian(Attributes attributes, CombatAttributes combatAttributes, Inventory inventory, Person person, int level, int expPoints, int rage) {
        super(attributes, combatAttributes, inventory, person, level, expPoints, rage);
    }

    public TotemicBarbarian() {
    }

    public int totemicSpirit()
    {
        return doDamage(2,4,6,5);
    }
    public int totemicHarmony()
    {
        return doDamage(3,5,10,15);
    }
}
