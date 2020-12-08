package model.mage;

import model.adv_tier.Adventurer;
import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class Mage extends Adventurer {

    private int mana;
    private int countMana;

    public Mage(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        super(atributos, combate, lvl, expPoints, inventory);
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
        if(this.getLvl() >= level)
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
