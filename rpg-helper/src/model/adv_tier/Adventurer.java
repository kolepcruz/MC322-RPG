package model.adv_tier;

public class Adventurer {

    private static int numAdventurers;

    private int id;
    private Atributos atributos;
    private Combate combate;
    private int lvl;
    private int expPoints;
    private Inventory inventory;

    public Adventurer(Atributos atributos, Combate combate, int lvl, int expPoints, Inventory inventory) {
        ++numAdventurers;
        this.id = numAdventurers;
        this.atributos = atributos;
        this.combate = combate;
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

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Combate getCombate() {
        return combate;
    }

    public void setCombate(Combate combate) {
        this.combate = combate;
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
