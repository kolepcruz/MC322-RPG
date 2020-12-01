package utils;
import model.adv_tier.Adventurer;

import java.lang.Math;

public class MathRPG {
    public static double calcModificador(int num){
        return Math.floor((num - 10)/2);
    }

    public static void calcXP(int exp_total, int num_aventureiros, Adventurer aventureiro){
       //Terminar quando a classe aventureiro estiver pronta
       // aventureiro.experience = exp_total/num_aventureiros;
    }
}
