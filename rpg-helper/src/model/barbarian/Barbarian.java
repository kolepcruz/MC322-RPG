package model.barbarian;

import enums.*;
import model.Person;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.adv_tier.CombatAttributes;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class Barbarian extends Adventurer {

    private int rage;
    private int countRage;

    public Barbarian(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                     Skin skin, String playerName, String caracterName ) {
        super(attributes,height,weight,hair,eyes,race,sex,skin,playerName,caracterName);
        this.rage = 15;
        this.countRage = 0;
    }

    public int getCountRage() {
        return countRage;
    }
    public void setCountRage(int countRage) {
        this.countRage = countRage;
    }

    public int getRage() {
        return rage;
    }
    public void setRage(int rage) {
        this.rage = rage;
    }

    public int doDamage(int level, int inter, int damageDice, int consumeRage){
        if(this.getLevel() >= level && this.getRage() >= consumeRage)
        {
            int damage = 0;
            for(int i = 0;i<inter;i++)
            {
                damage += RandomUtil.getRandom(damageDice);
            }
            setCountRage(getCountRage() - consumeRage);
            return damage;
        }
        return 0;
    }
}