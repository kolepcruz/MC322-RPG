package model.barbarian;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import utils.SkillsUtil;

public class FuriousBarbarian extends Barbarian implements SkillsUtil {
    /**
     * Class FuriousBarbarian é uma subtribo de Barbarian, nela possui algumas habilidades com que o Barbaro ataca
     */

    public FuriousBarbarian(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                     Skin skin, String playerName, String caracterName ) {

        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }


    public int power1()//retaliation
    {
        return doDamage(1,8,10,35);
    }

    public int power2()//frenzy
    {
        return doDamage(2,4,6,10);
    }

    public int power3()//berserker
    {
        return doDamage(3,5,10,20);
    }

    public int power4()//intimidatingPresence
    {
        return doDamage(4,8,10,35);
    }

    @Override
    public String toString() {
        String out = "FuriousBarbarian";
        out+="\n" + "-=-=-=-=-=-=-=-=-SKILLS=-=-=-=-=-=-=-=-" ;
        out+= "\n retaliation ";
        out+= "\n frenzy ";
        out+= "\n berserker ";
        return out + '\n' + super.toString();
    }
}
