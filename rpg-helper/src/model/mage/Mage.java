package model.mage;

import model.Person;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class Mage extends Adventurer {

    private int mana;
    private int countMana;

    public Mage(Attributes attributes, Combat combat, Inventory inventory, Person person, int lvl, int expPoints) {
        super(attributes, combat, inventory, person, lvl, expPoints);
        this.mana = 10;
    }

    public Mage() {
    }

    public int getCountMana() {
        return countMana;
    }
    public void setCountMana(int countMana) {
        this.countMana = countMana;
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    public int doDamage(int level, int inter, int damageDice, int consumeMana){
        if(this.getLevel() >= level && this.getMana() >= consumeMana)
        {
            int damage = 0;
            for(int i = 0;i<inter;i++)
            {
                damage += RandomUtil.getRandom(damageDice);
            }
            setCountMana(getCountMana() - consumeMana);
            return damage;
        }
        return 0;
    }
}
