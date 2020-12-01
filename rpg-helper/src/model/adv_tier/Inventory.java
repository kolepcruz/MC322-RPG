package model.adv_tier;

import enums.Armor;
import enums.Consumable;
import enums.Weapon;

import java.util.ArrayList;

public class Inventory {

    //todo : equip and get equipments automatically update the current weight of the inventory

    private ArrayList<Weapon> weapons;
    private ArrayList<Armor> armor;
    private ArrayList<Consumable> consumables;
    private int pos; // pecas de ouro
    private double weight;

    //CONSTRUTORES
    public Inventory(ArrayList<Weapon> weapons, ArrayList<Armor> armor, ArrayList<Consumable> consumables, int pos,
                     double weight)
    {
        this.weapons = weapons;
        this.armor = armor;
        this.consumables = consumables;
        this.pos = pos;
        this.weight = weight;
    }

    public Inventory() {
    }

    //GETTERS E SETTERS
    public ArrayList<Weapon> getWeapons()
    {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons)
    {
        this.weapons = weapons;
    }

    public ArrayList<Armor> getArmor()
    {
        return armor;
    }

    public void setArmor(ArrayList<Armor> armor)
    {
        this.armor = armor;
    }

    public ArrayList<Consumable> getConsumables()
    {
        return consumables;
    }

    public void setConsumables(ArrayList<Consumable> consumables)
    {
        this.consumables = consumables;
    }

    public int getPos()
    {
        return pos;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    //IMPLEMENTACAO DE METODOS

    /**
     * This method receives an x amount of pos (gold equivalent) and substracts it from the Invetory
     * true if the user can pay, else false
     * todo -> multiple kinds of currencys in game, and maybe allowing going into debt
     * @author kolepcruz
     */
    public boolean pay(int value){
        if(this.pos>=value){
            this.pos-=value;
            return true;
        }
        return false;
    }
}
