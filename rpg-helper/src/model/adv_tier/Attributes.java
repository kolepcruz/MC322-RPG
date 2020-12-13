package model.adv_tier;

import utils.MathRPGUtil;

public class Attributes {
    /*
    * Class Attributes armazena os atributos de um personagem.
    *   Cada Atributos possue um modificador utilizado para cálculos de dano.
    * */

    private int strenght;    //Força
    private int modStrenght; //Modificador de Força

    private int dexterity;    //Destreza
    private int modDexterity; //Modificador de Destreza

    private int constitution;
    private int modConstitution;

    private int intelligence;
    private int modIntelligence;

    private int wisdom;
    private int modWisdom;

    private int charisma;
    private int modCharisma;

    public Attributes(int strenght, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
    {
        this.strenght = strenght;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;

        this.modStrenght = MathRPGUtil.getMod(modStrenght);
        this.modDexterity = MathRPGUtil.getMod(modDexterity);
        this.modConstitution = MathRPGUtil.getMod(modConstitution);
        this.modIntelligence = MathRPGUtil.getMod(modIntelligence);
        this.modWisdom = MathRPGUtil.getMod(modWisdom);
        this.modCharisma = MathRPGUtil.getMod(modCharisma);
    }

    public Attributes() {
    }

    @Override
    public String toString() {
        return "[Attributes]" +
                "strenght=" + strenght +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }

    public int getStrenght() {
        return strenght;
    }
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getModStrenght() {
        return modStrenght;
    }
    public void setModStrenght(int modStrenght) {
        this.modStrenght = modStrenght;
    }

    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getModDexterity() {
        return modDexterity;
    }
    public void setModDexterity(int modDexterity) {
        this.modDexterity = modDexterity;
    }

    public int getConstitution() {
        return constitution;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getModConstitution() {
        return modConstitution;
    }
    public void setModConstitution(int modConstitution) {
        this.modConstitution = modConstitution;
    }

    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getModIntelligence() {
        return modIntelligence;
    }
    public void setModIntelligence(int modIntelligence) {
        this.modIntelligence = modIntelligence;
    }

    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getModWisdom() {
        return modWisdom;
    }
    public void setModWisdom(int modWisdom) {
        this.modWisdom = modWisdom;
    }

    public int getCharisma() {
        return charisma;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getModCharisma() {
        return modCharisma;
    }
    public void setModCharisma(int modCharisma) {
        this.modCharisma = modCharisma;
    }

    public int getTotalStrenght(){
        return this.getStrenght() + this.getModStrenght();
    }
    public int getTotalDexterity(){
        return this.getDexterity() + this.getModDexterity();
    }
    public int getTotalConstitution(){
        return this.getConstitution() + this.getModConstitution();
    }
    public int getTotalIntelligence(){
        return this.getIntelligence() + this.getModIntelligence();
    }
    public int getTotalWisdom(){
        return this.getWisdom() + this.getModWisdom();
    }
    public int getTotalCharisma(){
        return this.getCharisma() + this.getTotalCharisma();
    }
}
