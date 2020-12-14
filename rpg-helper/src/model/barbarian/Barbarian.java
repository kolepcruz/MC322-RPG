package model.barbarian;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import utils.RandomUtil;


/**
 * metodos doDamage foram implementados nessas main tribe e nao em adventurer devido a que eles consomem recursos
 * com funcionamentos diferentes entre cada main tribe
 */
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


    /**
     * Este metodo eh usado para dar dano
     * @param level o level necessario para usar a skill
     * @param inter a qtd de iteraçoes
     * @param damageDice o tipo de dado de dano
     * @param consumeRage quanta rage consome
     * @return o dano total feito
     * @author Jonas
     */
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