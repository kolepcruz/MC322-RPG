package model.mage;

import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class FrostMage extends Mage{

    public FrostMage(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        super(atributos, combate, lvl, expPoints, inventory);
    }

    public FrostMage() {
    }

    public int iceBeam()
    {
        return doDamage(1,3,4,5);
    }

    public int iceStorm()
    {
        return doDamage(2,4,6,10);
    }

    public int otilukeFreezingSphere()
    {
        return doDamage(3,5,10,20);
    }

    public int frostIcicle()
    {
        return doDamage(4,8,10,35);
    }
}
