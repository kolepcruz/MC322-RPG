package model.mage;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import utils.Skills;

public class FrostMage extends Adventurer implements Skills {
    /**
     * Class FrostMage é uma subtribo de Mage, nela possui algumas magias com que o Mago ataca
     */

    public FrostMage(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                    Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }

    public int power1()//iceBeam
    {
        return doDamage(1,3,4,5);
    }

    public int power2()//iceStorm
    {
        return doDamage(2,4,6,10);
    }

    public int power3()//otilukeFreezingSphere
    {
        return doDamage(3,5,10,20);
    }

    public int power4()//frostIcicle
    {
        return doDamage(4,8,10,35);
    }

    @Override
    public String toString() {
        String out = "FrostMage";
        out+="\n" + "-=-=-=-=-=-=-=-=-SKILLS=-=-=-=-=-=-=-=-" ;
        out+= "\n iceBeam ";
        out+= "\n iceStorm ";
        out+= "\n otilukeFreezingSphere ";
        out+= "\n frostIcicle ";
        return out + '\n' + super.toString();
    }
}
