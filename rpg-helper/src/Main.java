import utils.CharacterCreatorUtil;
import utils.NarratorUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NarratorUtil.greetings();
        Scanner scanner = new Scanner(System.in);
        CharacterCreatorUtil.createAdventurer(scanner);
    }
}
