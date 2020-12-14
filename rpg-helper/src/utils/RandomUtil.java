package utils;

import java.util.Random;

public class RandomUtil {
    //Class RandomUtil armazena métodos estáticos para gerar números aleatórios.

    private static final Random random = new Random(System.currentTimeMillis());

    public static int getRandom(int value)
    {
        return random.nextInt(value);
    }

    public static int getInitialGold(int iterations,int diceType)
    {
        int totalGold = 0;
        for( int i = 0; i < iterations;++i)
        {
            totalGold+= random.nextInt(diceType);
        }
        return 10*totalGold;
    }
}
