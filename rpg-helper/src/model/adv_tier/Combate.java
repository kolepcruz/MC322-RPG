package model.adv_tier;

public class Combate {

    private int armorPoints;
    private int iniciativePoints;
    private int totalHp;
    private int currentHp;

    public Combate(int armorPoints, int iniciativePoints, int totalHp, int currentHp)
    {
        this.armorPoints = armorPoints;
        this.iniciativePoints = iniciativePoints;
        this.totalHp = totalHp;
        this.currentHp = currentHp;
    }

    public Combate() {
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
