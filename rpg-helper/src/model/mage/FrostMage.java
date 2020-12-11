package model.mage;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class FrostMage extends Mage{

    public FrostMage(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        super(attributes, combat, lvl, expPoints, inventory);
    }

    public FrostMage() {
    }

    public int iceBeam()
    {
        if(this.getLvl() >= 1)
        {
            int damage = 0;
            for (int i = 0; i<3;++i)
            {
                damage+= RandomUtil.getRandom(4);
            }
            this.setMana(this.getMana()-5);
            return damage;
        }
        return 0;
    }

    public int iceStorm()
    {
        if(this.getLvl() >= 2)
        {
            int damage = 0;
            for (int i = 0; i<4;++i)
            {
                damage+= RandomUtil.getRandom(6);
            }
            this.setMana(this.getMana()-10);
            return damage;
        }
        return 0;
    }

    public int otilukeFreezingSphere()
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

    public int frostIcicle()
    {
        if(this.getLvl() >= 4)
        {
            int damage = 0;
            for (int i = 0; i<8;++i)
            {
                damage+= RandomUtil.getRandom(10);
            }
            this.setMana(this.getMana()-35);
            return damage;
        }
        return 0;
    }
}
