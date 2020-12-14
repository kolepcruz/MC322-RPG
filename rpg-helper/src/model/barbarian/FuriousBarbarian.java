package model.barbarian;

import enums.*;
import model.adv_tier.Attributes;

public class FuriousBarbarian extends Barbarian{

    public FuriousBarbarian(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                     Skin skin, String playerName, String caracterName ) {

        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
    }

    //todo colocar uma descriçao do que cada metodo faz (mais pelo roleplay,pode ser no comentario bravo memo)

    public int retaliation()
    {
        return doDamage(1,8,10,35);
    }

    public int frenzy()
    {
        return doDamage(2,4,6,10);
    }

    public int berserker() {
        return doDamage(3,5,10,20);
    }

    public int intimidatingPresence()
    {
        return doDamage(4,8,10,35);
    }

    @Override
    public String toString() {
        String out = "FuriousBarbarian";
        out+="\n" + "#".repeat(5) + "SKILLS" + "#".repeat(5);
        out+= "\n retaliation ";
        out+= "\n frenzy ";
        out+= "\n berserker ";
        return out + '\n' + super.toString();
    }
}
