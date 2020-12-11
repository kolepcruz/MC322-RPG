package model;

import enums.*;

public class Person {

    private final int height;
    private final int weight;
    private Skin skin;
    private Hair hair;
    private Eyes eyes;
    private Race race;
    private Sex sex;
    private final String playerName; //nome do jogador
    private final String name; //nome da personagem

    public Person(int height, int weight, Hair hair, Eyes eyes, Race race, Sex sex, String playerName, String name)
    {
        this.height = height;
        this.weight = weight;
        this.hair = hair;
        this.eyes = eyes;
        this.race = race;
        this.sex = sex;
        this.playerName = playerName;
        this.name = name;
    }

    @Override
    public String toString() {
        String out = "[Personagem: "+getPlayerName()+"]\n";

        out = out + "\tJogador: "+getName()+"\n";
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

    public String getName() {
        return name;
    }
}