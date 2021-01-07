import enums.Weapon;
import model.adv_tier.Adventurer;
import model.barbarian.FuriousBarbarian;
import utils.Arquivos;
import utils.CharacterCreatorUtil;
import utils.NarratorUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        NarratorUtil.greetings();
        Scanner scanner = new Scanner(System.in);
        Adventurer a  = CharacterCreatorUtil.startCharacterCreation(scanner);
        a.getInventory().addWeapon(Weapon.TRIDENT);
        System.out.println(a);
        scanner.close();

        Arquivos.write("Ladino", a);
        Arquivos.read("teste.txt");
    }
}
