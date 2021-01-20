package model.mage;

import enums.*;

import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;

import utils.RandomUtil;

public class Mage extends Adventurer {

    private int mana;
    private int countMana;

    public Mage(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                      Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
        this.mana = 20;
        this.countMana = 20;
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


    /**
     * Este método eh usado para dar dano
     * @param level o level necessário para usar a skill
     * @param inter a qtd de iteraçoes
     * @param damageDice o tipo de dado de dano
     * @param consumeMana quanta mana consome
     * @return o dano total feito
     * @author Jonas
     */
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
