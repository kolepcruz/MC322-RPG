import model.adv_tier.Adventurer;
import model.barbarian.FuriousBarbarian;
import utils.CharacterCreatorUtil;
import utils.NarratorUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NarratorUtil.greetings();
        Scanner scanner = new Scanner(System.in);
        Adventurer a  = CharacterCreatorUtil.startCharacterCreation(scanner);

        if(a instanceof FuriousBarbarian)
            System.out.println(a);

        System.out.println(a);
    }
}
