package model.mage;

import enums.*;
import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

public class FireMage extends Mage {

    public FireMage(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
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
