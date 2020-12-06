package model.mage;

import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;
import utils.RandomUtil;

import java.util.Random;

public class ArcaneMage extends Mage{

    public ArcaneMage(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        super(atributos, combate, lvl, expPoints, inventory);
    }

    public ArcaneMage() {
    }

    public int arcaneArmor()
    {
        if(this.getLvl() >= 1 )
        {
            int damage = 0;
            for(int i = 0;i < 4 ;++i)
            {
                damage+= RandomUtil.getRandom(4);
            }
            this.setMana(this.getMana() - 8);
            return damage;
        }
        return 0;
    }

    public int magicMissiles()
    {
        if(this.getLvl() >= 2)
        {
            int damage = 0;
            for (int i = 0; i<6;++i)
            {
                damage+=RandomUtil.getRandom(6);
            }
            this.setMana(this.getMana()-18);
            return damage;
        }
        return 0;
    }

    public int prismaticBarrage()
    {
        if(this.getLvl() >= 3)
        {
            int damage = 0;
            for (int i = 0; i<10;++i)
            {
                damage+=RandomUtil.getRandom(10);
            }
            this.setMana(this.getMana()-28);
            return damage;
        }
        return 0;
    }

    public int arcanePortal()
    {
        if(this.getLvl() >= 4)
        {
            int damage = 0;
            for (int i = 0; i<10;++i)
            {
                damage+=RandomUtil.getRandom(6);
            }
            this.setMana(this.getMana()-22);
            return damage;
        }
        return 0;
    }
}
