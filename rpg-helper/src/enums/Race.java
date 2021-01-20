package enums;

public enum Race {
    /**
     * Class Race armazena as opções de raças dos aventureiros
     * cada raça modifica de forma única os atributos e modificadores
     */
    //RACE(strength, dexterity, constitution, intelligence, wisdom, charisma)
    DWARF(2,0,2,0,1,0),
    ELF(0,2,0,1,1,1),
    HALFLING(0,2,1,0,0,1),
    DRAGONBORN(2,0,0,0,0,1),
    HUMAN(1,1,1,1,1,1),
    GNOME(0,1,1,2,0,0),
    HALF_ELF(0,0,0,1,1,2),
    HALF_ORC(2,0,1,0,0,0),
    TIEFLING(0,0,0,1,0,2);


    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    Race(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getConstitution() {
        return constitution;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getCharisma() {
        return charisma;
    }
}