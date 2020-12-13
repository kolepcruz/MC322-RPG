package model.barbarian;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class TotemicBarbarian extends Barbarian{

    public TotemicBarbarian(Attributes attributes, Combat combat, Inventory inventory, Person person, int level, int expPoints, int rage) {
        super(attributes, combat, inventory, person, level, expPoints, rage);
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
