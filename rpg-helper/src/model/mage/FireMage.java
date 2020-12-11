package model.mage;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class FireMage extends Mage {

    public FireMage(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
    }

    public FireMage() {
    }

    public int metheorStorm()
    {
        return doDamage(1,3,6,10);
    }

    public int fireBall()
    {
        return doDamage(2,4,10,15);
    }

    public int burningBeam()
    {
        return doDamage(3,5,10,20);
    }

    public int flamingSphere() {
        return doDamage(4, 8, 6, 3);
    }
}
