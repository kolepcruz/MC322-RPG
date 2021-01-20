package model.rogue;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import utils.SkillsUtil;

public class AssassinRogue extends Adventurer implements SkillsUtil {
    /**
     * Class AssassinRogue é uma subtribo de Rogue, nela possui algumas habilidades com que o Ladino ataca
     */

    public AssassinRogue(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                 Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }

    public int power1()//assassinate
    {
        return doDamage(2,4,6,10);
    }
    public int power2()//fatalBlow
    {
        return doDamage(3,5,10,20);
    }
    public int power3(){
        System.out.println("não tem esse poder");
        return 0;
    }
    public int power4(){
        System.out.println("não tem esse poder");
        return 0;
    }

    @Override
    public String toString() {
        String out = "AssassinRogue";
        out+="\n" + "-=-=-=-=-=-=-=-=-SKILLS=-=-=-=-=-=-=-=-" ;
        out+= "\n assassinate ";
        out+= "\n fatalBlow ";
        return out + '\n' + super.toString();
    }
}
