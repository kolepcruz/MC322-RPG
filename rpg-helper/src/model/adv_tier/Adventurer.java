package model.adv_tier;

public class Adventurer {

    private static int numAdventurers;

    private int id;
    private Attributes attributes;
    private Combat combat;
    private int lvl;
    private int expPoints;
    private Inventory inventory;


    public Adventurer(Attributes attributes, Combat combat, int lvl, int expPoints, Inventory inventory) {
        ++numAdventurers;
        this.id = numAdventurers;
        this.attributes = attributes;
        this.combat = combat;
        this.lvl = lvl;
        this.expPoints = expPoints;
        this.inventory = inventory;
    }

    public Adventurer() {
    }

    public static int getNumAdventurers() {
        return numAdventurers;
    }

    public static void setNumAdventurers(int numAdventurers) {
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

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
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
