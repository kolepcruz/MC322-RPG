package model.mage;

import enums.*;
import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

public class ArcaneMage extends Mage{

    public ArcaneMage(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                            Skin skin, String playerName, String caracterName ) {

        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
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
