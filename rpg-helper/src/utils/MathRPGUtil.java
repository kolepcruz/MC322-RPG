package utils;
import model.adv_tier.Adventurer;

import java.lang.Math;
import java.util.ArrayList;

public class MathRPGUtil {

    public static int getMod(int num){
        return (int)(Math.floor((num - 10)/2));
    }

    /**
     * Alterado metodo em 1/12/20
     * @author Erik Yuji Goto
     */
    public static void getExperience(int expTotal, ArrayList<Adventurer> aventureiros){
       //Terminar quando a classe aventureiro estiver pronta
        for (Adventurer a : aventureiros) {
            a.setExpPoints((int) (a.getExpPoints() + Math.floor(expTotal/aventureiros.size())));
        }
    }
}