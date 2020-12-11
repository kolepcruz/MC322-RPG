package enums;

public enum Race {
    DWARF(0,0,0,0,0,0),
    ELF(0,0,0,0,0,0),
    HALFLING(0,0,0,0,0,0),
    HUMAN(0,0,0,0,0,0),
    DRACONATE(0,0,0,0,0,0),
    GNOME(0,0,0,0,0,0),
    HALF_ELFO(0,0,0,0,0,0),
    HALF_ORC(0,0,0,0,0,0),
    TIEFLING(0,0,0,0,0,0);

    private final int strenght;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int carisma;

    Race(int strenght, int dexterity, int constitution, int intelligence, int wisdom, int carisma) {
        this.strenght = strenght;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.carisma = carisma;
    }

    public int getStrenght() {
        return strenght;
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

    public int getCarisma() {
        return carisma;
    }
}
