package model.adv_tier;

public class Combat {

    private int armorPoints;
    private int iniciativePoints;
    private int totalHP;
    private int currentHP;

    public Combat(int armorPoints, int iniciativePoints, int totalHP, int currentHP)
    {
        this.armorPoints = armorPoints;
        this.iniciativePoints = iniciativePoints;
        this.totalHP = totalHP;
        this.currentHP = currentHP;
    }

    public Combat() {
    }

    @Override
    public String toString() {
        return "Combat{" +
                "armorPoints=" + armorPoints +
                ", iniciativePoints=" + iniciativePoints +
                ", totalHp=" + totalHP +
                ", currentHp=" + currentHP +
                '}';
    }

    public int getArmorPoints() {
        return armorPoints;
    }
    public void setArmorPoints(int armorPoints) {
        this.armorPoints = armorPoints;
    }

    public int getIniciativePoints() {
        return iniciativePoints;
    }
    public void setIniciativePoints(int iniciativePoints) {
        this.iniciativePoints = iniciativePoints;
    }

    public int getTotalHP() {
        return totalHP;
    }
    public void setTotalHP(int totalHP) {
        this.totalHP = totalHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }
    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }
}
