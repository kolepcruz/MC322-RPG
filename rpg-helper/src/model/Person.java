package model;

import enums.*;

public class Person {

    private final int altura;
    private final int peso;
    private Pele pele;
    private Cabelo cabelo;
    private Olhos olhos;
    private Race race;
    private Sexo sexo;
    private final String playerName; //nome do jogador
    private final String name; //nome da personagem

    public Person(int altura, int peso, Cabelo cabelo, Olhos olhos, Race race, Sexo sexo, String playerName, String name)
    {
        this.altura = altura;
        this.peso = peso;
        this.cabelo = cabelo;
        this.olhos = olhos;
        this.race = race;
        this.sexo = sexo;
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
        return altura;
    }
    public int getPeso() {
        return peso;
    }

    public Pele getPele() {
        return pele;
    }
    public void setPele(Pele pele) {
        this.pele = pele;
    }

    public Cabelo getCabelo() {
        return cabelo;
    }

    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    public Olhos getOlhos() {
        return olhos;
    }

    public void setOlhos(Olhos olhos) {
        this.olhos = olhos;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getPlayerName() {
        return playerName;
    }


    public String getName() {
        return name;
    }
}