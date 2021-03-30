package model.mage;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import utils.SkillsUtil;


public class FireMage extends Mage implements SkillsUtil {
    /**
     * Class FireMage é uma subtribo de Mage, nela possui algumas magias com que o Mago ataca
     */

    public FireMage(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }

    public int power1()//meteorStorm
    {
        return doDamage(1,3,6,10);
    }

    public int power2()//fireBall
    {
        return doDamage(2,4,10,15);
    }

    public int power3()//burningBeam
    {
        return doDamage(3,5,10,20);
    }

    public int power4()// flamingSphere
    {
        return doDamage(4, 8, 6, 3);
    }

    @Override
    public String toString() {
        String out = "FireMage";
        out+="\n" + "-=-=-=-=-=-=-=-=-SKILLS=-=-=-=-=-=-=-=-" ;
        out+= "\n meteorStorm ";
        out+= "\n fireBall ";
        out+= "\n burningBeam ";
        out+= "\n flamingSphere ";
        return out + '\n' + super.toString();
    }
}
