package utils;

import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random(System.currentTimeMillis());

    public static int getRandom(int value)
    {
        return random.nextInt(value);
    }
}
