package utils;
import model.adv_tier.Adventurer;

import java.lang.Math;
import java.util.ArrayList;

public class MathRPG {


    public static double calcModificador(int num){
        return Math.floor((num - 10)/2);
    }

    /**
     * Alterado metodo em 1/12/20
     *
     * @author Erik Yuji Goto
     */
    public static void calcXP(int expTotal, ArrayList<Adventurer> aventureiros){
       //Terminar quando a classe aventureiro estiver pronta
        for (Adventurer a : aventureiros) {
            a.setExpPoints((int) (a.getExpPoints() + Math.floor(expTotal/aventureiros.size())));
        }
    }
}
