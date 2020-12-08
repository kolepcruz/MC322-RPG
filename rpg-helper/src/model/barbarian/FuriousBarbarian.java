package model.barbarian;

import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;
import utils.RandomUtil;

import java.util.Random;

public class FuriousBarbarian extends Barbarian{

    public FuriousBarbarian(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory, int rage) {
        super(atributos, combate, lvl, expPoints, inventory, rage);
    }

    public FuriousBarbarian() {
    }

    public int retaliation()
    {
        return doDamage(1,8,10,35);
    }

    public int frenzy()
    {
        return doDamage(2,4,6,10);
    }

    public int berserker()
    {
        return doDamage(3,5,10,20);

    }

    public int intimidatingPresence()
    {
        return doDamage(4,8,10,35);
    }
}
