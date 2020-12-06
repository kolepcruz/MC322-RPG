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
    private Armor armorEquiped;
    private Weapon weaponEquiped;
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

        weapons = new ArrayList();

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

    public Armor getArmorEquiped() {
        return armorEquiped;
    }

    public Weapon getWeaponEquiped() {
        return weaponEquiped;
    }

    /**
     * O atributo weight é calculado somando todos as armaduras e armas que estão no inventario
     * @return
     */
    public double getWeight()
    {
        //todo : IMPORTANTE: O valor inicial de weight é o valor passado como parametro no construtor, este deve ser o peso do personagem
        //Peso de todas as armaduras
        for (int i = 0; i < armor.size(); i++){
            weight += armor.get(i).getPeso();
        }
        //Peso de todas as armas
        for (int i = 0; i < weapons.size(); i++){
            weight += weapons.get(i).getPeso();
        }
        return weight;
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

    //Equipa armadura
    public boolean equipArmor(Armor armor_to_equip){
        if(armor.contains(armor_to_equip)){
            armorEquiped = armor_to_equip;
            return true;
        }
        else return false;
    }

    //Equipa arma
    public boolean equipWeapon(Weapon weapon_to_equip){
        if(weapons.contains(weapon_to_equip)){
            weaponEquiped = weapon_to_equip;
            return true;
        }
        else return false;
    }

    //ToString
    public String toString(){
        String out = "-=-=-=-=-=-=-=-=-INVENTORY-=-=-=-=-=-=-=-=-\n";
        out += "Armors:\n";
        for(Armor i : armor){
            //Se o armor equipado for printado o caracter antes do seu nome será "->"
            if(i == armorEquiped)
                out += "-> " + i + "\n";
            else
                out += "* " + i + "\n";
        }

        out += "\nWeapons:\n";
        for(Weapon i : weapons){
            if(i == weaponEquiped)
                //Se o weapon equipado for printado o caracter antes do seu nome será "->"
                out += "-> " + i + "\n";
            else
                out += "* " + i + "\n";
        }

        out += "\nConsumable:\n";
        for(Consumable i : consumables){
            out += "* " + i + "\n";
        }

        out += "\nPeso total:\n" + getWeight() + " kg";
        return out;
    }
}