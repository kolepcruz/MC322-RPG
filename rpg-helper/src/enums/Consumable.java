package enums;

public enum Consumable {
    /**
     * Class Consumable armazena os possiveis consumiveis dos aventureiros que os ajudam nos combates
     */
    //POTION(val)
    MANA_POTION(10),
    LIFE_POTION(10),
    STAMINA_POTION(10),
    ADRENALINE_POTION(10);

    private int val; //The potion value

    Consumable(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}