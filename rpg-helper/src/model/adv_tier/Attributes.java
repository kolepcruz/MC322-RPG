package model.adv_tier;

import utils.MathRPGUtil;

public class Attributes {

    private int strenght;
    private int modStrenght;

    private int dexterity;
    private int modDexterity;

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
        this.modStrenght = MathRPGUtil.getMod(modStrenght);
        this.dexterity = dexterity;
        this.modDexterity = MathRPGUtil.getMod(modDexterity);
        this.constitution = constitution;
        this.modConstitution = MathRPGUtil.getMod(modConstitution);
        this.intelligence = intelligence;
        this.modIntelligence = MathRPGUtil.getMod(modIntelligence);
        this.wisdom = wisdom;
        this.modWisdom = MathRPGUtil.getMod(modWisdom);
        this.charisma = charisma;
        this.modCharisma = MathRPGUtil.getMod(modCharisma);
    }

    public Attributes() {
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
}
