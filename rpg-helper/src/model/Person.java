package model;

import enums.*;

public class Person {

    private double height;//Altura do Personagem
    private double weight;//Peso do Personagem
    private Skin skin;//Pele do Personagem
    private Hair hair;//Cabelo do Personagem
    private Eyes eyes;//Olhos do Personagem
    private Race race;//Raça do Personagem
    private Sex sex;//Sexo do Personagem
    private final String playerName; //Nome do Jogador
    private final String caracterName; //Nome do Personagem

    public Person(double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                  Skin skin, String playerName, String caracterName)
    {
        this.skin = skin;
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
        String out = "-=-=-=-=-=-=-=-=-|"+getPlayerName()+"|-=-=-=-=-=-=-=-=-\n";

        out = out + " Personagem: "+getCaracterName()+"\n";
        out = out + " Race: "+getRace()+"\n";
        out = out + " Sexo: "+ getSex()+"\n";
        out = out + " Altura: "+ getHeight()+"\n";
        out = out + " Peso: "+ getWeight()+"\n";
        out = out + " Pele: "+ getSkin()+"\n";
        out = out + " Olhos: "+getEyes()+"\n";
        out = out + " Cabelo: "+getHair()+"\n";
        return out;
    }


    public double getHeight() {
        return height;
    }
    public double getWeight() {
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