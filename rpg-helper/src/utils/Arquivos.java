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

        String filename =  "./Fichas Criadas/Personagem RPG - " + nome;
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

    public static ArrayList read(String nome){
        ArrayList infos = new ArrayList();
        String filename = nome;

        try{
            Scanner input = new Scanner(new File(nome));
            while(input.hasNext()){
                infos.add(input.next());
            }
        }catch (IOException ex){
            ex.printStackTrace();

        }
        return infos;
    }

}
