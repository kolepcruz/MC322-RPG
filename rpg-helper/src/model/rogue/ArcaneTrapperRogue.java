package model.rogue;

import model.adv_tier.Atributos;
import model.adv_tier.Combate;
import model.adv_tier.Inventory;
import utils.RandomUtil;

public class ArcaneTrapperRogue extends Rogue {

    public ArcaneTrapperRogue(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        super(atributos, combate, lvl, expPoints, inventory);
    }

    public ArcaneTrapperRogue() {
    }

    public int Conjuration(){
        return doDamage(1,6,4,10);
    }

    public int theEnd(){
        return doDamage(4,11,10,30);
    }
}
