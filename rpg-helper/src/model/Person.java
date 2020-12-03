package model;

import enums.Cabelo;
import enums.Olhos;
import enums.Race;
import enums.Sexo;

public class Person {

    private Cabelo cabelo;
    private Olhos olhos;
    private Race race;
    private Sexo sexo;
    private final String playerName; //nome do jogador
    private final String name; //nome da personagem

    public Person(Cabelo cabelo, Olhos olhos, Race race, Sexo sexo, String playerName, String name)
    {
        this.cabelo = cabelo;
        this.olhos = olhos;
        this.race = race;
        this.sexo = sexo;
        this.playerName = playerName;
        this.name = name;
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
