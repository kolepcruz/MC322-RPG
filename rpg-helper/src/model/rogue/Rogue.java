package model.rogue;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import utils.RandomUtil;

public class Rogue extends Adventurer {

    private int stamina;
    private int countStamina;

    public Rogue(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                     Skin skin, String playerName, String caracterName ) {
        super(attributes, height, weight, hair, eyes, race, sex, skin, playerName, caracterName);
        this.stamina = 15;
        this.countStamina = 15;
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

    /**
     * Este metodo eh usado para dar dano
     * @param level o level necessario para usar a skill
     * @param inter a qtd de iteraçoes
     * @param damageDice o tipo de dado de dano
     * @param consumeStamina quanta stamina consome
     * @return o dano total feito
     * @author Jonas
     */
    public int doDamage(int level, int inter, int damageDice, int consumeStamina){
        if(this.getLevel() >= level && this.getStamina() >= consumeStamina)
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
