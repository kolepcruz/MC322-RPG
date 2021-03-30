package model.adv_tier;

import utils.MathRPGUtil;

public class Attributes {
    /**
    * Class Attributes armazena os atributos de um personagem.
    *   Cada Atributos possue um modificador utilizado para cálculos de dano.
    */

    private int strength;    //Força
    private int modStrength; //Modificador de Força

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

    public Attributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
    {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;

        this.modStrength = MathRPGUtil.getMod(strength);
        this.modDexterity = MathRPGUtil.getMod(dexterity);
        this.modConstitution = MathRPGUtil.getMod(constitution);
        this.modIntelligence = MathRPGUtil.getMod(intelligence);
        this.modWisdom = MathRPGUtil.getMod(wisdom);
        this.modCharisma = MathRPGUtil.getMod(charisma);
    }

    public Attributes() {
    }

    @Override
    public String toString() {
        return "-=-=-=-=-=-=-=-=-ATTRIBUTES-=-=-=-=-=-=-=-=-" +
                "\n strenght = " + strength +
                "\n dexterity = " + dexterity +
                "\n constitution = "  + constitution +
                "\n intelligence = " + intelligence +
                "\n wisdom = " + wisdom +
                "\n charisma = " + charisma + "\n";
    }

    public int getStrength() {
        return strength;
    }
    public void setStrenght(int strength) {
        this.strength = strength;
    }

    public int getModStrength() {
        return modStrength;
    }
    public void setModStrength(int modStrength) {
        this.modStrength = modStrength;
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

    /**
     * metodos utilizados para obter o valor total de determinado atributo
     * @return a soma do valor base + o modificador
     */
    public int getTotalStrength(){
        return this.getStrength() + this.getModStrength();
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
