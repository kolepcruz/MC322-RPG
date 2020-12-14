package model.rogue;

import enums.*;
import model.adv_tier.Attributes;

public class AssassinRogue extends Rogue{

    public AssassinRogue(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                 Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
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
