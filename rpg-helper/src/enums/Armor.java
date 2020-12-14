package enums;

public enum Armor {
    /**
     * Class Armor armazena todas as opções de armaduras que os aventureiro podem ter, eles começam com uma determinada
     */
    //ARMOR(price, armorClass, weight)
    PADDED(5, 11, 4),
    BEATEN_LEATHER(45, 12, 6.5),

    MAIL_SHIRT(50, 13, 10),
    HALF_ARMOR(750, 15, 20),

    RING_MAIL(30, 14, 20),
    SPLINT(200, 17, 30),

    SHIELD(10, 2, 3),

    NO_ARMOR(0, 0, 0); //NO_ARMOR é usado para referenciar o aventureiro sem armadura

    private int price;      //How much the armor costs to buy
    private int armorClass; //Which class the armor belongs
    private double weight;  //How much it weights

    Armor(int price, int armorClass, double weight){
        this.price = price;
        this.armorClass = armorClass;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }
    public int getArmorClass() {
        return armorClass;
    }
    public double getWeight() {
        return weight;
    }
}