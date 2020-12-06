package model.rogue;

import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class AssassinRogue extends Rogue{

    public AssassinRogue(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        super(atributos, combate, lvl, expPoints, inventory);
    }

    public AssassinRogue() {
    }

    public int assassinate()
    {
        if(this.getLvl() >= 2)
        {
            int damage = 0;
            for (int i = 0; i<4;++i)
            {
                damage+= RandomUtil.getRandom(6);
            }
            this.setStamina(this.getStamina()-10);
            return damage;
        }
        return 0;
    }

    public int fatalBlow()
    {
        if(this.getLvl() >= 3)
        {
            int damage = 0;
            for (int i = 0; i<5;++i)
            {
                damage+= RandomUtil.getRandom(10);
            }
            this.setStamina(this.getStamina()-20);
            return damage;
        }
        return 0;
    }
}
