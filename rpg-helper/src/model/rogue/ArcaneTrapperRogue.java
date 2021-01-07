package model.rogue;

import enums.*;
import model.adv_tier.Attributes;
import utils.Skills;

public class ArcaneTrapperRogue extends Rogue implements Skills {
    /**
     * Class ArcaneTrapperRogue é uma subtribo de Rogue, nela possui algumas habilidades com que o Ladino ataca
     */

    public ArcaneTrapperRogue(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                         Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }

    public int power1()//Conjuration
    {
        return doDamage(1,6,4,10);
    }
    public int power2()//theEnd
    {
        return doDamage(4,11,10,30);
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
        String out = "ArcaneTrapperRogue";
        out+="\n" + "-=-=-=-=-=-=-=-=-SKILLS=-=-=-=-=-=-=-=-" ;
        out+= "\n Conjuration ";
        out+= "\n theEnd ";
        return out + '\n' + super.toString();
    }
}
