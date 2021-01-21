package model.barbarian;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import utils.SkillsUtil;

public class TotemicBarbarian extends Barbarian implements SkillsUtil {
    /**
     * Class TotemicBarbarian é uma subtribo de Barbarian, nela possui algumas habilidades com que o Barbaro ataca
     */

    public TotemicBarbarian(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                            Skin skin, String playerName, String caracterName ) {

        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }

    public int power1()//totemicSpirit
    {
        return doDamage(2,4,6,5);
    }
    public int power2()//totemicHarmony
    {
        return doDamage(3,5,10,15);
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
        String out = "TotemicBarbarian";
        out+="\n" + "-=-=-=-=-=-=-=-=-SKILLS=-=-=-=-=-=-=-=-" ;
        out+= "\n totemicSpirit ";
        out+= "\n totemicHarmony ";
        return out + '\n' + super.toString();
    }
}
