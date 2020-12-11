package model.mage;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class FireMage extends Mage {

    public FireMage(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
    }

    public FireMage() {
    }

    public int metheorStorm()
    {
        if(this.getLvl() >= 1)
        {
            int damage = 0;
            for (int i = 0; i<3;++i)
            {
                damage+= RandomUtil.getRandom(6);
            }
            this.setMana(this.getMana()-10);
            return damage;
        }
        return 0;
    }

    public int fireball()
    {
        if(this.getLvl() >= 2)
        {
            int damage = 0;
            for (int i = 0; i<4;++i)
            {
                damage+= RandomUtil.getRandom(10);
            }
            this.setMana(this.getMana()-15);
            return damage;
        }
        return 0;
    }

    public int burningBeam()
    {
        if(this.getLvl() >= 3)
        {
            int damage = 0;
            for (int i = 0; i<5;++i)
            {
                damage+= RandomUtil.getRandom(10);
            }
            this.setMana(this.getMana()-20);
            return damage;
        }
        return 0;
    }

    public int flamingSphere()
    {
        if(this.getLvl() >= 4)
        {
            int damage = 0;
            for (int i = 0; i<8;++i)
            {
                damage+= RandomUtil.getRandom(6);
            }
            this.setMana(this.getMana()-3);
            return damage;
        }
        return 0;
    }
}
