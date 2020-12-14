package model.adv_tier;

import enums.Armor;

public class CombatAttributes {


    /**
     * Nesta classe temos os atributos que serao usados principalmente no combate
     */
    private int armorPoints;
    private int iniciativePoints;
    private int totalHP;
    private int currentHP;


    public CombatAttributes(Attributes attributes, Armor equippedArmor, int initialValue)
    {
        this.armorPoints = equippedArmor.getArmorClass() + attributes.getModDexterity();
        this.iniciativePoints = attributes.getModDexterity();
        this.totalHP = attributes.getModConstitution() + initialValue;
        this.currentHP = totalHP;
    }

    public CombatAttributes() {
    }

    @Override
    public String toString() {
        return "-=-=-=-=-=-=-=-=-COMBAT-ATTRIBUTES-=-=-=-=-=-=-=-=-" +
                "\n armorPoints = " + armorPoints +
                "\n iniciativePoints = " + iniciativePoints +
                "\n totalHp = " + totalHP +
                "\n currentHp = " + currentHP;
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
