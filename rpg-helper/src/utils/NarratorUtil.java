package utils;

public class NarratorUtil {
    /**
     * Class NarratorUtil seria o layout do programa
     */

    public static void greetings(){
        System.out.println("Bem Vindos ao RPG-HELPER!!");
        System.out.println("Este trabalho foi desenvolvido por um grupo de alunos ECA-019 da Unicamp para MC322 \n" +
                "Tem como intuito a familiarizaçao com algumas mecanicas de criar personagens em RPGs\n" +
                "Creditos aos alunos :\n\n" +
                "     \t- Trofino \n" +
                "     \t- Kole \n" +
                "     \t- Jonas \n" +
                "     \t- Erik \n");
    }

    public static void classIntroduction(){
        System.out.println("#".repeat(50));
        System.out.println("#".repeat(50));

        System.out.println("BARBARIAN:\n"+
                           "\tBarbarians são famosos por sua incrível força e resistência ao dano físico");
        System.out.println("Utilizam rage para causar dano devastador ápos o começo do combate, e esta aumenta quando" +
                "o Barbarian se encontra em combate com forças inimigas, diminuindo a medida que o tempo passa");
        System.out.println("\n"+"*".repeat(50)+"\n");
        System.out.println("MAGE:\n\tMages utilizam seu conhecimento e domínio do arcano para lançar feitiços" +
                "devastadores nas forças inimigas");
        System.out.println("Utilizam mana, um recurso poderoso que se regenera lentamente, abre as portas" +
                "para magias muito potentes");
        System.out.println("\n"+"*".repeat(50)+"\n");
        System.out.println("ROGUE:\n\tOs rogues são os reis do subterfúgio, utilizam sua destreza e seu ambiente" +
                "para derrotar inimigos mais fortes fisicamente ou com poder destrutivo maior");
        System.out.println("Utilizam stamina para utilizar suas habilidades, e eh um recurso de alta regeneraçao" +
                "tanto dentro quanto fora do combate, mas gasta muito rapido");
        System.out.println("#".repeat(50));
        System.out.println("#".repeat(50));

        System.out.println("Agora escolha entre estas principais Classes do RPG-Helper");
    }

    public static void subclassIntroduction(int chosen)
    {
        switch (chosen) {
            case 0 -> {
                System.out.println("Furious: Para alguns bárbaros, a fúria é um meio para um fim," +
                        " esse fim é a violência." +
                        "\n O Furioso é um caminho de fúria livre, entumecido em sangue." +
                        "\n A medida que você entra na fúria de um furioso, você vibra no caos da batalha," +
                        " despreocupado com a sua própria saúde ou bem-estar.");
                System.out.println("*".repeat(30));
                System.out.println("Totemic: O Caminho Totêmico é uma jornada espiritual,\n à partir do momento que o " +
                        "bárbaro aceita um espirito animal como seu guia, protetor e inspiração.\n " +
                        "Em batalha, seu espirito totêmico preenche você com força sobrenatural,\n " +
                        "adicionando combustível mágico a sua fúria bárbara.");
                System.out.println("*".repeat(30));
            }
            case 1 -> {
                System.out.println("FrostMage: Como um Mago do Gelo," +
                        " você prefere magias que produzam efeito retardante nos alvos.\n" +
                        " Você pode conjurar mágias como Tempestade de Gelo e a medida de que seu domínio aumentar,\n" +
                        " você pode fazer uso de magias como Ciclo de Gelo.");
                System.out.println("*".repeat(30));
                System.out.println("FireMage: Você foca seu estudo para criar poderosos efeitos elementais do fogo, \n" +
                        "alguns evocadores encontram emprego nas forças militares,\n" +
                        " servindo como artilharia para explodir fileiras inimigas de longe.");
                System.out.println("*".repeat(30));
                System.out.println("ArcaneMage: Você é um estudante de magias que modificam energia e matéria.\n" +
                        " Para você, o mundo não é uma coisa fixa, " +
                        "mas sim eminentemente mutável e você se deleita em ser um agente da mudança.\n" +
                        " Você empunha a matéria-prima da criação e aprendeu tanto formas físicas" +
                        " quanto qualidades mentais.\n Sua magia lhe dá as ferramentas para se tornar" +
                        " um verdadeiro arcano.");
                System.out.println("*".repeat(30));
            }
            default -> {
                System.out.println("Assassin: Você focou seu treinamento na macabra arte da morte.\n" +
                        " Aqueles que devotam-se a esse arquétipo são diversos: \n" +
                        "assassinos de aluguel, espiões, caçadores de recompensa e, até mesmo, padres especialmente" +
                        " treinados em exterminar os inimigos das suas divindades. \n" +
                        "Subterfúgio, veneno e disfarces ajudam você a eliminar seus oponentes com " +
                        "eficiência mortífera.");
                System.out.println("*".repeat(30));
                System.out.println("ArcaneTrapper: Alguns ladinos aprimoram suas finas perícias de furtividade e " +
                        "agilidade com magia, aprendendo truques de encantamento e ilusão. \n" +
                        "Esses ladinos incluem não somente batedores de carteira e assaltantes, \n" +
                        "mas também trapaceiros, enganadores e um número significativo de aventureiros.");
                System.out.println("*".repeat(30));
            }
        }
    }
}
