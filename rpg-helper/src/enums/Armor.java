package enums;

public enum Armor {
    //ARMADURA(Preco, Classe de Armadura, Peso),
    PADDED(5, 11, 4),
    BEATEN_LEADER(45, 12, 6.5),

    MAIL_SHIRT(50, 13, 10),
    HALF_ARMOR(750, 15, 20),

    COTA_DE_ANEIS(30, 14, 20),
    COTA_DE_TALAS(200, 17, 30),

    SHIELD(10, 2, 3);

    private int price;
    private int armor_class;
    private double weight;

    Armor(int price, int armor_class, double weight){
        this.price = price;
        this.armor_class = armor_class;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }
    public int getArmor_class() {
        return armor_class;
    }
    public double getWeight() {
        return weight;
    }

}
