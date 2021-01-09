package utils;
import model.adv_tier.Adventurer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Arquivos {
    public static void write(String nome, Adventurer adventurer){
        File dir = new File("Fichas Criadas");
        if(dir.exists() == false)
            dir.mkdir();

        String filename =  "./Fichas Criadas/Personagem RPG - " + nome + " (" + adventurer.getPlayerName() + ")";
        String mensagem = adventurer.toString();

        try{
            Formatter output = new Formatter(filename);
            output.format("%s", mensagem);
            output.flush();
            output.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void read(String nome){
        try{
            Scanner input = new Scanner(new File("./Descricao/" + nome));
            while(input.hasNext())
                System.out.print(input.nextLine() + "\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
