package utils;

import enums.*;
import model.Person;
import model.adv_tier.Adventurer;

import java.util.EnumSet;
import java.util.Scanner;
import java.util.jar.Attributes;

public class CharacterCreatorUtil {

    private static Attributes distributeAttributePoints(Scanner sc)
    {
        return new Attributes();
    }

    /**
     * Este metodo recebe as entradas do usuario e realiza a construçao do objeto person que se encontra dentro
     * da classe adventurer, recebe varios parametros, entre eles Race, que torna a chamada deste metodo uma
     * muito importante para o calculo do valor total dos parametros do aventureiro
     * Recebe os inputs e utiliza o metodo chooseTarget para receber os valores que o usuario quer para os enums
     *
     * @author kole
     */
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
     //   Person person = createPerson(sc);
        NarratorUtil.classIntroduction();

        Attributes attributes;

        return null;
    }

    private static int chooseCharacterClass(Scanner sc)
    {
        System.out.println("Barbarian ---> 1");
        System.out.println("Mage --------> 2");
        System.out.println("Rogue -------> 3");
        return receiveAndValidateInput(3,sc);
    }

    /**
     * Este metodo recebe um enum generico, lista e enumera seus valores e recebe input de usuario para determinar
     * qual foi o valor do enum que o usuario escolhe
     * Recebe uma classe Enum generica e um Scanner
     * Desenvolvido dessa maneira para ser reutilizavel dentro da classe CharacterCreatorUtil, se quiser chamar fora
     * tirar o private do metodo
     *
     * @implNote Este metodo tira um do valor de input no retorno
     * @author kole
     */
    private static <E extends Enum<E>> int chooseTarget(Class<E> enumClass,Scanner sc){
        System.out.println("Selecione o numero depois da flecha (---->) :");
        for (E e : EnumSet.allOf(enumClass))
        {
            System.out.println(e.name() + " " + "-".repeat(Math.max(0, 15 - e.name().length())) +
                    "----> " + (e.ordinal()+1));
        }
        return receiveAndValidateInput(EnumSet.allOf(enumClass).size(),sc);
    }

    private static int receiveAndValidateInput(int size,Scanner sc){
        int chosenValue;
        boolean withinRange;
        do{
            chosenValue = sc.nextInt();
            withinRange = chosenValue > 0 && chosenValue <= size;
            if(!withinRange)
                System.out.println("Por favor, insira um valor valido");
        }while(!withinRange);

        return chosenValue-1;
    }
}
