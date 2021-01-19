package utils;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.barbarian.FuriousBarbarian;
import model.barbarian.TotemicBarbarian;
import model.mage.ArcaneMage;
import model.mage.FireMage;
import model.mage.FrostMage;
import model.rogue.ArcaneTrapperRogue;
import model.rogue.AssassinRogue;

import java.io.IOException;
import java.util.*;


public class CharacterCreatorUtil {


    /**
     * Este metodo serve para distribuir os atributos dos usuarios
     * @param race
     * @param sc
     * @return
     * @author kole
     */
    private static Attributes distributeAttributePoints(Race race, Scanner sc)
    {
        System.out.println("A continuaçao vc escolhera como distribuir seus atributos");
        System.out.println("Devido a raça do personagem, alguns terao valores iniciais");
        System.out.println("Voce tera 72 pontos para distribuir, escolha sabiamente :) ");
        int pointsToDistribute = 72;

        List<Integer> stats = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        int chosenStat;
        int amount;
        while(pointsToDistribute > 0){
            System.out.println("#".repeat(30));
            System.out.println("Disponivel ---> |" + pointsToDistribute + "|\n");

            System.out.println("Strenght ------- |" + stats.get(0) + "| ---> 1");
            System.out.println("Dexterity ------ |" + stats.get(1) + "| ---> 2");
            System.out.println("Intellingence -- |" + stats.get(2) + "| ---> 3");
            System.out.println("Charisma ------- |" + stats.get(3) + "| ---> 4");
            System.out.println("Wisdom --------- |" + stats.get(4) + "| ---> 5");
            System.out.println("Constitution --- |" + stats.get(5) + "| ---> 6");
            System.out.println("-".repeat(30));

            System.out.println("Selecione qual atributo deseja alterar");
            boolean maxed;
            boolean exceeds;
            boolean usesMore;
            do{
                chosenStat = receiveAndValidateInput(6,sc);
                maxed = stats.get(chosenStat) >= 15;
                if(maxed)
                    System.out.println("Este atributo esta no seu valor maximo \npor favor, escolha um diferente :)");
            }while (maxed);

            System.out.println("Escolha um valor de 1 a 15 para adicionar nesse atributo\n" +
                                "Lembre que o valor maximo de cada atributo eh de 15");
            do{
                amount = receiveAndValidateInput(15,sc) + 1; // O metodo devolve o valor digitado - 1
                exceeds = stats.get(chosenStat) + amount > 15;
                usesMore = pointsToDistribute < amount;
                if(exceeds)
                    System.out.println("O valor escolhido excede o valor maximo possivel");
                if(usesMore)
                    System.out.println("Por favor, insira um valor menor ou igual ao disponivel");
            }while( exceeds || usesMore);
            stats.set(chosenStat,stats.get(chosenStat) + amount);
            pointsToDistribute-=amount;

        }
        return new Attributes(  stats.get(0) + race.getStrenght(),
                                stats.get(1) + race.getDexterity(),
                                stats.get(5) + race.getConstitution(),
                                stats.get(2) + race.getIntelligence(),
                                stats.get(4) + race.getWisdom(),
                                stats.get(3) + race.getCharisma());
    }

    /**
     * Este metodo recebe as entradas do usuario e realiza a construçao
     * da classe adventurer, recebe varios parametros, entre eles Race, que torna a chamada deste metodo uma
     * muito importante para o calculo do valor total dos parametros do aventureiro
     * Recebe os inputs e utiliza o metodo chooseTarget para receber os valores que o usuario quer para os enums
     *
     * @author kole
     */
    private static Adventurer createAdventurer(Scanner sc,int mainClass, int subClass)
    {
        System.out.println("A continuaçao vc inserira as caracteristicas fisicas do seu personagem, deixe solta" +
                " a sua imaginaçao :)");
        sc.nextLine(); //para pegar qualquer \n que tenha aparecido em outras chamadas do scanner
        System.out.println("Insira o seu proprio nome ");
        String nomePlayer = sc.nextLine();

        System.out.println("Insira o nome do seu personagem ");
        String nomeAdventurer = sc.nextLine();

        System.out.println("Escolha sua raça entre as seguintes opçoes\n");
        int chosenRace = chooseEnum( Race.class, sc);

        System.out.println("Escolha a cor dos seus Olhos");
        int chosenEyes = chooseEnum( Eyes.class,sc);

        System.out.println("Escolha a cor da sua Pele");
        int chosenSkin = chooseEnum(Skin.class,sc);

        System.out.println("Escolha seu Sexo");
        int chosenSex = chooseEnum(Sex.class,sc);

        System.out.println("Escolha a cor do seu cabelo");
        int chosenHair = chooseEnum(Hair.class,sc);

        System.out.println("Insira o peso do seu personagem (kg)");
        double chosenWeight = sc.nextDouble();
        if(chosenWeight <= 0)
            System.out.println("Ok, ninguem pode ser magro assim viu :)");

        System.out.println("Insira a altura do seu personagem (m)");
        double chosenHeight = sc.nextDouble();
        if(chosenHeight <= 0)
            System.out.println("hmmmmm, certeza que essa sera a altura? :P");

        Attributes attributes = distributeAttributePoints(Race.values()[chosenRace],sc);

        //todo otimizar essa parte do codigo seria uma boa ideia

        if(mainClass == 0 && subClass == 0)
            return new FuriousBarbarian(attributes,chosenHeight,chosenWeight,Hair.values()[chosenHair],
                                        Eyes.values()[chosenEyes],Race.values()[chosenRace],
                                        Sex.values()[chosenSex],Skin.values()[chosenSkin],nomePlayer,nomeAdventurer);
        else if(mainClass == 0 && subClass == 1)
            return new TotemicBarbarian(attributes,chosenHeight,chosenWeight,Hair.values()[chosenHair],
                                        Eyes.values()[chosenEyes],Race.values()[chosenRace],
                                        Sex.values()[chosenSex],Skin.values()[chosenSkin],nomePlayer,nomeAdventurer);
        else if(mainClass == 1 && subClass == 0)
            return new FrostMage(attributes,chosenHeight,chosenWeight,Hair.values()[chosenHair],
                                        Eyes.values()[chosenEyes],Race.values()[chosenRace],
                                        Sex.values()[chosenSex],Skin.values()[chosenSkin],nomePlayer,nomeAdventurer);
        else if(mainClass == 1 && subClass == 1)
            return new FireMage(attributes,chosenHeight,chosenWeight,Hair.values()[chosenHair],
                                        Eyes.values()[chosenEyes],Race.values()[chosenRace],
                                        Sex.values()[chosenSex],Skin.values()[chosenSkin],nomePlayer,nomeAdventurer);
        else if(mainClass == 1 && subClass == 2)
            return new ArcaneMage(attributes,chosenHeight,chosenWeight,Hair.values()[chosenHair],
                                        Eyes.values()[chosenEyes],Race.values()[chosenRace],
                                        Sex.values()[chosenSex],Skin.values()[chosenSkin],nomePlayer,nomeAdventurer);
        else if(mainClass == 2 && subClass == 0)
            return new AssassinRogue(attributes,chosenHeight,chosenWeight,Hair.values()[chosenHair],
                                        Eyes.values()[chosenEyes],Race.values()[chosenRace],
                                        Sex.values()[chosenSex],Skin.values()[chosenSkin],nomePlayer,nomeAdventurer);
        else
            return new ArcaneTrapperRogue(attributes,chosenHeight,chosenWeight,Hair.values()[chosenHair],
                                        Eyes.values()[chosenEyes],Race.values()[chosenRace],
                                        Sex.values()[chosenSex],Skin.values()[chosenSkin],nomePlayer,nomeAdventurer);
    }


    /**
     * Starta a criacao de um personagem
     * @param sc
     * @return
     */
    public static Adventurer startCharacterCreation(Scanner sc)
    {
        System.out.println("Bem vindo na criacao do aventureiro\n" +
                "Faremos algumas perguntas a continuaçao");
        NarratorUtil.classIntroduction();
        System.out.println("Escolha qual destas tribos vc quer que seu personagem faça parte.");
        int mainClass = chooseCharacterClass(sc);
        int subClass;
        switch (mainClass) {
            case 0 -> {
                NarratorUtil.subclassIntroduction(mainClass);
                subClass = chooseBarbarianSubclass(sc);
            }
            case 1 -> {
                NarratorUtil.subclassIntroduction(mainClass);
                subClass = chooseMageSubclass(sc);
            }
            default -> {
                NarratorUtil.subclassIntroduction(mainClass);
                subClass = chooseRogueSubclass(sc);
            }
        }

        return createAdventurer(sc,mainClass,subClass);
    }

    private static int chooseCharacterClass(Scanner sc)
    {
        System.out.println("Barbarian ---> 1");
        System.out.println("Mage --------> 2");
        System.out.println("Rogue -------> 3");
        return receiveAndValidateInput(3,sc);
    }

    private static int chooseBarbarianSubclass(Scanner sc)
    {
        System.out.println("Furious ---> 1");
        System.out.println("Totemic ---> 2");
        return receiveAndValidateInput(2,sc);
    }

    private static int chooseMageSubclass(Scanner sc)
    {
        System.out.println("FrostMage --------> 1");
        System.out.println("FireMage ---------> 2");
        System.out.println("ArcaneMage -------> 3");
        return receiveAndValidateInput(3,sc);
    }

    private static int chooseRogueSubclass(Scanner sc)
    {
        System.out.println("Assassin -------------> 1");
        System.out.println("ArcaneTrapper --------> 2");

        return receiveAndValidateInput(2,sc);
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
    private static <E extends Enum<E>> int chooseEnum(Class<E> enumClass, Scanner sc){
        System.out.println("Selecione o numero depois da flecha (---->) :");
        for (E e : EnumSet.allOf(enumClass))
        {
            System.out.println(e.name() + " " + "-".repeat(Math.max(0, 15 - e.name().length())) +
                    "----> " + (e.ordinal()+1));
        }
        return receiveAndValidateInput(EnumSet.allOf(enumClass).size(),sc);
    }

    /**
     *
     * @param size qtd de elementos que serao mostrados
     * @param sc scanner
     * @return o valor escolhido menos 1
     */
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



    private static Attributes getAttributesPoints(Race race, int strenght, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
    {
        return new Attributes(
            strenght + race.getStrenght(),
            dexterity + race.getDexterity(),
            constitution + race.getConstitution(),
            intelligence + race.getIntelligence(),
            wisdom + race.getWisdom(),
            charisma + race.getCharisma()
        );
    }

    private static Adventurer createAdventurer(
        Attributes attributes,
        String characterName, 
        String playerName,
        int chosenClass,
        int chosenSubClass,
        int chosenHeight,
        int chosenWeight,
        int chosenRace,
        int chosenEyes,
        int chosenSkin,
        int chosenSex,
        int chosenHair,
        int chosen)
    {
        if(chosenClass == 0 && chosenSubClass == 0)
        {
            return new FuriousBarbarian(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 0 && chosenSubClass == 1)
        {
            return new TotemicBarbarian(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 1 && chosenSubClass == 0)
        {
            return new FrostMage(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 1 && chosenSubClass == 1)
        {
            return new FireMage(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 1 && chosenSubClass == 2)
        {
            return new ArcaneMage(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 2 && chosenSubClass == 0)
        {
            return new AssassinRogue(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else
        {
            return new ArcaneTrapperRogue(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
    }
}
