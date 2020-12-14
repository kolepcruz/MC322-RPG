package enums;

public enum Weapon {
    //WEAPON(price, damage, weight),
    DAGGER(2, "1d4", 0.5),
    CLUB_BIG(2, "1d8", 5),
    HATCHET(5, "1d6", 1),
    SWORD_LONG(15, "1d8", 1.5),
    AXE_BIG(30, "1d12", 3.5),
    WAR_HAMMER(15, "1d8", 1),
    RAPIER(25, "1d8", 2),
    TRIDENT(5, "1d6", 4),

    NO_WEAPON(0, "0d0", 0);

    private int price;
    private String damage;
    private double weight;

    Weapon(int price, String damage, double weight){
        this.price = price;
        this.damage = damage;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }
    public String getDamage() {
        return damage;
    }
    public double getWeight() {
        return weight;
    }
}