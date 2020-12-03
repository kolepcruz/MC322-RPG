package model;

import enums.*;

public class Person {

    private Race race;
    private Sexo sexo;
    private final int altura;
    private final int peso;
    private Pele pele;
    private Olhos olhos;
    private Cabelo cabelo;
    private final String nomePersonagem;
    private final String nomeJogador;

    public Person(int altura, int peso, String nomePersonagem, String nomeJogador) {
        this.altura = altura;
        this.peso = peso;
        this.nomePersonagem = nomePersonagem;
        this.nomeJogador = nomeJogador;
    }

    @Override
    public String toString() {
        String out = "[Personagem: "+getNomePersonagem()+"]\n";

        out = out + "\tJogador: "+getNomeJogador()+"\n";
        out = out + "\t\tRace: "+getRace()+"\n";
        out = out + "\t\tSexo: "+getSexo()+"\n";
        out = out + "\t\tAltura: "+getAltura()+"\n";
        out = out + "\t\tPeso: "+getPeso()+"\n";
        out = out + "\t\tPele: "+getPele()+"\n";
        out = out + "\t\tOlhos: "+getOlhos()+"\n";
        out = out + "\t\tCanelo: "+getCabelo()+"\n";

        return out;
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

    public Olhos getOlhos() {
        return olhos;
    }
    public void setOlhos(Olhos olhos) {
        this.olhos = olhos;
    }

    public Cabelo getCabelo() {
        return cabelo;
    }
    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }
}
