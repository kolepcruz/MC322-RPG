package enums;

public enum Consumable {
    POCAO_MANA(10),
    POCAO_VIDA(10),
    POCAO_STAMINA(10),
    POCAO_ADRENALINA(10);

    private int val;
    Consumable(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
