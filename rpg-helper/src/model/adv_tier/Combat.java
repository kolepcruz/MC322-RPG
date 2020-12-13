package model.adv_tier;

public class Combat {

    private int armorPoints;
    private int iniciativePoints;
    private int totalHp;
    private int currentHp;

    public Combat(int armorPoints, int iniciativePoints, int totalHp, int currentHp)
    {
        this.armorPoints = armorPoints;
        this.iniciativePoints = iniciativePoints;
        this.totalHp = totalHp;
        this.currentHp = currentHp;
    }

    public Combat() {
    }

    @Override
    public String toString() {
        return "Combat{" +
                "armorPoints=" + armorPoints +
                ", iniciativePoints=" + iniciativePoints +
                ", totalHp=" + totalHp +
                ", currentHp=" + currentHp +
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

    public int getTotalHp() {
        return totalHp;
    }
    public void setTotalHp(int totalHp) {
        this.totalHp = totalHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }
    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
}
