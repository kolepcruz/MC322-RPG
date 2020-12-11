package model.rogue;

import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class Rogue extends Adventurer {

    private int stamina;
    private int countStamina;

    public Rogue(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
        this.stamina = 15;
    }

    public Rogue() {
    }

    public int getCountStamina() {
        return countStamina;
    }

    public void setCountStamina(int countStamina) {
        this.countStamina = countStamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int doDamage(int level, int inter, int damageDice, int consumeStamina){
        if(this.getLvl() >= level)
        {
            int damage = 0;
            for(int i = 0;i<inter;i++)
            {
                damage += RandomUtil.getRandom(damageDice);
            }
            setCountStamina(getCountStamina() - consumeStamina);
            return damage;
        }
        return 0;
    }
}
