package utils;

public class NarratorUtil {

    public static void greetings(){
        System.out.println("Bem Vindos ao RPG-HELPER!!");
        System.out.println("Este trabalho foi desenvolvido por um grupo de alunos ECA-019 da Unicamp para MC322 \n" +
                "Tem como intuito a familiarizaçao com algumas mecanicas de criar personagens em RPGs\n" +
                "Creditos aos alunos :\n" +
                " \n" +
                "     - Trofino \n" +
                "     - Kole \n" +
                "     - Jonas \n" +
                "     - Erik \n");
    }

    public static void classIntroduction(){
        System.out.println("#".repeat(50));
        System.out.println("Agora vc devera escolher entre as 3 principais Classes do RPG-Helper");
        System.out.println("Barbarian :\n\tOs barbarians sao famosos pela sua incrivel força e" +
                " resistencia ao dano fisico");
        System.out.println("Utilizam rage para causar dano devastador apos o começo do combate, e esta aumenta quando" +
                "o barbarian se encontra em combate com forças inimigas, diminuindo a medida que o tempo passa");
        System.out.println("*".repeat(50));
        System.out.println("Mage :\n\tOs mages utilizam seu conhecimento dominio do arcano para lançar feitiços" +
                "devastadores nas forças inimigas");
        System.out.println("Utilizam mana, um recurso poderoso que se regenera mais lentamente, mas abre as portas" +
                "para magias muito potentes");
        System.out.println("*".repeat(50));
        System.out.println("Rogue :\n\tOs rogues sao os reis do subterfugio, utilizam sua destreza e seu ambiente" +
                "para derrotar inimigos mais fortes fisicamente ou com poder destrutivo maior");
        System.out.println("Utilizam stamina para utilizar suas habilidades, e eh um recurso de alta regeneraçao" +
                "tanto dentro quanto fora do combate, mas gasta muito rapido");
        System.out.println("*".repeat(30));
    }
}
