package model.barbarian;

import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class Barbarian extends Adventurer {

    private int rage;
    private int countRage;

    public Barbarian(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory, int rage) {
        super(attributes, combat, lvl, expPoints, inventory);
        this.rage = rage;
    }

    public Barbarian() {
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
        if(this.getLvl() >= level && this.getRage() >= consumeRage)
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