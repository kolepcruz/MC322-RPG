package enums;

public enum Consumable {
    POCAO_MANA(10),
    POCAO_VIDA(10),
    POCAO_STAMINA(10),
    POCAO_ADRENALINA(10);

    private int num;
    Consumable(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
