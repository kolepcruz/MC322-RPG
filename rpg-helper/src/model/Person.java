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
        out = out + "\t\tSexo: "+getSexo()+"\n";
        out = out + "\t\tAltura: "+getAltura()+"\n";
        out = out + "\t\tPeso: "+getPeso()+"\n";
        out = out + "\t\tPele: "+getPele()+"\n";
        out = out + "\t\tOlhos: "+getOlhos()+"\n";
        out = out + "\t\tCanelo: "+getCabelo()+"\n";

        return out;
    }


    public int getAltura() {
        return height;
    }
    public int getPeso() {
        return weight;
    }

    public Skin getPele() {
        return skin;
    }
    public void setPele(Skin skin) {
        this.skin = skin;
    }

    public Hair getCabelo() {
        return hair;
    }

    public void setCabelo(Hair hair) {
        this.hair = hair;
    }

    public Eyes getOlhos() {
        return eyes;
    }

    public void setOlhos(Eyes eyes) {
        this.eyes = eyes;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Sex getSexo() {
        return sex;
    }

    public void setSexo(Sex sex) {
        this.sex = sex;
    }

    public String getPlayerName() {
        return playerName;
    }


    public String getName() {
        return name;
    }
}