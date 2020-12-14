import model.adv_tier.Adventurer;
import utils.CharacterCreatorUtil;
import utils.NarratorUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NarratorUtil.greetings();
        Scanner scanner = new Scanner(System.in);
        Adventurer a  = CharacterCreatorUtil.startCharacterCreation(scanner);
        System.out.println(a);
    }
}
