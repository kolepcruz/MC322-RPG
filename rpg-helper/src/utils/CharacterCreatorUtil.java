package utils;

import enums.*;
import model.Person;
import model.adv_tier.Adventurer;

import java.util.EnumSet;
import java.util.Scanner;
import java.util.jar.Attributes;

public class CharacterCreatorUtil {

    private static Attributes distributeAtPoints()
    {
        return null;
    }

    private static Person createPerson(Scanner sc)
    {
        System.out.println("Insira as caracteristicas fisicas do seu personagem");

        System.out.println("Insira o seu proprio nome ");
        String nomePlayer = sc.nextLine();
        System.out.println("Insira o nome do seu personagem ");
        String nomeAdventurer = sc.nextLine();

        System.out.println("Escolha sua raça entre as seguintes opçoes\n");
        int chosenRace = chooseTarget( Race.class, sc);

        System.out.println("Escolha a cor dos seus Olhos");
        int chosenEyes = chooseTarget( Eyes.class,sc);

        System.out.println("Escolha a cor da sua Pele");
        int chosenSkin = chooseTarget(Skin.class,sc);

        System.out.println("Escolha seu Sexo");
        int chosenSex = chooseTarget(Sex.class,sc);

        System.out.println("Escolha a cor do seu cabelo");
        int chosenHair = chooseTarget(Hair.class,sc);

        System.out.println("Insira o peso do seu personagem");
        double chosenWeight = sc.nextDouble();

        System.out.println("Insira a altura do seu personagem");
        double chosenHeight = sc.nextDouble();

        Person person = new Person(chosenHeight, chosenWeight, Hair.values()[chosenHair], Eyes.values()[chosenEyes],
                                        Race.values()[chosenRace], Sex.values()[chosenSex],Skin.values()[chosenSkin],
                                        nomePlayer, nomeAdventurer);
        System.out.println(person);
        return person;
    }

    public static Adventurer createAdventurer(Scanner sc)
    {
        System.out.println("Bem vindo na criacao do aventureiro\n" +
                "Faremos algumas perguntas a continuaçao");
        Person person = createPerson(sc);





        return null;
    }
    private static int chooseCharacterClass(Scanner sc)
    {
        System.out.println("Agora vc devera escolher entre as 3 principais Classes do RPG-Helper");
        System.out.println("Barbarian :\n\tOs barbarians sao famosos pela sua incrivel força e" +
                " resistencia ao dano fisico");

        return 1;
    }

    private static <E extends Enum<E>> int chooseTarget(Class<E> enumClass,Scanner sc){
        System.out.println("Selecione o numero depois da flecha (---->) :");
        for (E e : EnumSet.allOf(enumClass))
        {
            System.out.println(e.name() + " " + "-".repeat(Math.max(0, 15 - e.name().length())) +
                    "----> " + (e.ordinal()+1));
        }
        int chosenValue;
        boolean withinRange;
        do{
            chosenValue = sc.nextInt();
            withinRange = chosenValue > 0 && chosenValue <= EnumSet.allOf(enumClass).size();
            if(!withinRange)
                System.out.println("Por favor, insira um valor valido");
        }while(!withinRange);

        return chosenValue-1;
    }
}
