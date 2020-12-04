import java.util.Random;
public class Random1 {
        public static int fazRandom(int a){
            Random gerador = new Random();
            return gerador.nextInt(a);
        }
}
