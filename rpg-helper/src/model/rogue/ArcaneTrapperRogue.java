package model.rogue;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;

public class ArcaneTrapperRogue extends Rogue {

    public ArcaneTrapperRogue(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
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
