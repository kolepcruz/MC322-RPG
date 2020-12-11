package enums;

public enum Consumable {
    MANA_POTION(10),
    LIFE_POTION(10),
    STAMINA_POTION(10),
    ADRENALINE_POTION(10);

    private int val;
    Consumable(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
