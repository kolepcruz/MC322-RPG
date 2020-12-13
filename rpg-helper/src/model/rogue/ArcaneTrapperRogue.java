package model.rogue;

import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;

public class ArcaneTrapperRogue extends Rogue {

    public ArcaneTrapperRogue(Attributes attributes, Combat combat, Inventory inventory, Person person, int level, int expPoints) {
        super(attributes, combat, inventory, person, level, expPoints);
    }

    public ArcaneTrapperRogue() {
    }

    public int Conjuration(){
        return doDamage(1,6,4,10);
    }

    public int theEnd(){
        return doDamage(4,11,10,30);
    }
}
