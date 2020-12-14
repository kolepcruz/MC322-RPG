package model.rogue;

import enums.*;
import model.Person;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;

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

    @Override
    public String toString() {
        String out = "AssassinRogue";
        out+="\n" + "#".repeat(5) + "SKILLS" + "#".repeat(5);
        out+= "\n assassinate ";
        out+= "\n fatalBlow ";
        return out + '\n' + super.toString();
    }
}
