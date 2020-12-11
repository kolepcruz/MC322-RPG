package model.barbarian;

import model.adv_tier.Attributes;
import model.adv_tier.Combat;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class FuriousBarbarian extends Barbarian{

    public FuriousBarbarian(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory, int rage) {
        super(attributes, combat, lvl, expPoints, inventory, rage);
    }

    public FuriousBarbarian() {
    }

    public int retaliation()
    {
        if(this.getLvl() == 1)
        {
            int damage = 0;
            for(int i = 0;i<8;i++)
            {
                damage += RandomUtil.getRandom(10);
            }
            this.setRage(this.getRage() - 35);
            return damage;
        }
        return 0;
    }

    public int frenzy()
    {
        if(this.getLvl() == 2)
        {
            int damage = 0;
            for(int i = 0;i<4;i++)
            {
                damage+=RandomUtil.getRandom(6);
            }
            this.setRage(this.getRage() - 10);
            return damage;
        }
        return 0;
    }

    public int berserker()
    {
        if(this.getLvl() == 3)
        {
            int damage = 0;
            for(int i = 0;i<5;i++)
            {
                damage+=RandomUtil.getRandom(10);
            }
            this.setRage(this.getRage() - 20);
            return damage;
        }
        return 0;
    }

    public int intimidatingPresence()
    {
        if(this.getLvl() == 4)
        {
            int damage = 0;
            for(int i = 0;i<8;i++)
            {
                damage += RandomUtil.getRandom(10);
            }
            this.setRage(this.getRage() - 35);
            return damage;
        }
        return 0;
    }
}
