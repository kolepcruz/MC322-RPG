package model.rogue;

import enums.*;
import model.adv_tier.Attributes;

public class ArcaneTrapperRogue extends Rogue {

    public ArcaneTrapperRogue(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                         Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }

    public int Conjuration(){
        return doDamage(1,6,4,10);
    }

    public int theEnd(){
        return doDamage(4,11,10,30);
    }
}
