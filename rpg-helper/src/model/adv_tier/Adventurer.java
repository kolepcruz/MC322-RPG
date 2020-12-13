package model.adv_tier;

import model.Person;

public class Adventurer {

    private static int numAdventurers;

    private int id;
    private int level;
    private int expPoints;
    private Combat combat;
    private Person person;
    private Inventory inventory;
    private Attributes attributes;


    public Adventurer(Attributes attributes, Combat combat, Inventory inventory, Person person, int level, int expPoints) {
        ++numAdventurers;
        this.id = numAdventurers;
        this.level = level;
        this.expPoints = expPoints;
        this.combat = combat;
        this.person = person;
        this.inventory = inventory;
        this.attributes = attributes;
    }

    public Adventurer() {
    }

    @Override
    public String toString() {
        return "Adventurer{" +
                "id=" + id +
                ", level=" + level +
                ", expPoints=" + expPoints +
                ", combat=" + combat +
                ", person=" + person +
                ", inventory=" + inventory +
                ", attributes=" + attributes +
                '}';
    }

    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public static int getNumAdventurers() {
        return numAdventurers;
    }
    private static void setNumAdventurers(int numAdventurers) {
        Adventurer.numAdventurers = numAdventurers;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Attributes getAtributos() {
        return attributes;
    }
    public void setAtributos(Attributes attributes) {
        this.attributes = attributes;
    }

    public Combat getCombate() {
        return combat;
    }
    public void setCombate(Combat combat) {
        this.combat = combat;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getExpPoints() {
        return expPoints;
    }
    public void setExpPoints(int expPoints) {
        this.expPoints = expPoints;
    }

    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
