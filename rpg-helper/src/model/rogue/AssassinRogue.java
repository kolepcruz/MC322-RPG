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
        return doDamage(2,4,6,10);
    }

    public int fatalBlow()
    {
        return doDamage(3,5,10,20);
    }
}
