package model;

import enums.*;

public class Person {
    //Class Person armazena as características físicas do persongem a ser criado.

    private final int height; //Altura do Personagem
    private final int weight; //Peso do Personagem
    private Skin skin;        //Pele do Personagem
    private Hair hair;        //Cabelo do Personagem
    private Eyes eyes;        //Olhos do Personagem
    private Race race;        //Raça do Personagem
    private Sex sex;          //Sexo do Personagem
    private final String playerName; //Nome do Jogador
    private final String caracterName; //Nome do Personagem

    public Person(int height, int weight, Hair hair, Eyes eyes, Race race, Sex sex, String playerName, String caracterName)
    {
        this.height = height;
        this.weight = weight;
        this.hair = hair;
        this.eyes = eyes;
        this.race = race;
        this.sex = sex;
        this.playerName = playerName;
        this.caracterName = caracterName;
    }

    @Override
    public String toString() {
        String out = "[Personagem: "+getPlayerName()+"]\n";

        out = out + "\tJogador: "+ getCaracterName()+"\n";
        out = out + "\t\tRace: "+getRace()+"\n";
        out = out + "\t\tSexo: "+ getSex()+"\n";
        out = out + "\t\tAltura: "+ getHeight()+"\n";
        out = out + "\t\tPeso: "+ getWeight()+"\n";
        out = out + "\t\tPele: "+ getSkin()+"\n";
        out = out + "\t\tOlhos: "+getEyes()+"\n";
        out = out + "\t\tCanelo: "+getHair()+"\n";

        return out;
    }


    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }

    public Skin getSkin() {
        return skin;
    }
    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Hair getHair() {
        return hair;
    }
    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public Eyes getEyes() {
        return eyes;
    }
    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getPlayerName() {
        return playerName;
    }
    public String getCaracterName() {
        return caracterName;
    }
}