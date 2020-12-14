package model.adv_tier;

import enums.Armor;
import enums.Consumable;
import enums.Weapon;
import model.barbarian.Barbarian;
import model.mage.Mage;
import model.rogue.Rogue;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Weapon> weapons;
    private ArrayList<Armor> armors;
    private ArrayList<Consumable> consumables;
    private Armor armorEquiped;
    private Weapon weaponEquiped;
    private int gold; // pecas de ouro
    private double weight;
    private double maxWeight;

    //CONSTRUTORES
    public Inventory(ArrayList<Weapon> weapons, ArrayList<Armor> armors,int gold, int strenght) {
        this.weapons = weapons;
        this.armors = armors;
        this.consumables = new ArrayList<Consumable>();
        this.gold = gold;
        maxWeight = strenght * 7.5;
    }

    //GETTERS E SETTERS
    public double getMaxWeight() {
        return maxWeight;
    }

    public ArrayList<Weapon> getWeapons()
    {
        return weapons;
    }
    public void setWeapons(ArrayList<Weapon> weapons)
    {
        //Guarda os weapons temporariamente em tempWeapon
        ArrayList tempWeapon = this.weapons;
        this.weapons = weapons;

        //Se o peso, após adicionados as armas for maior que maxWeight, a lista weapons retorna ao seu estado inicial
        if(getWeight() < maxWeight){
            System.out.println("\n[Mensagem]Adicionado armas\n");
            return;
        }
        this.weapons = tempWeapon;
        System.out.println("\n[Aviso]Peso máximo excedido\n");
    }

    public ArrayList<Armor> getArmors()
    {
        return armors;
    }
    public void setArmors(ArrayList<Armor> armors)
    {
        //Guarda os armors temporariamente em tempArmor
        ArrayList tempArmor = this.armors;
        this.armors = armors;

        //Se o peso, após adicionados as armaduras for maior que maxWeight, a lista armors retorna ao seu estado inicial
        if(getWeight() < maxWeight){
            System.out.println("\n[Mensagem]Adicionado armaduras\n");
            return;
        }
        this.armors = tempArmor;
        System.out.println("\n[Aviso]Peso máximo excedido\n");
    }

    public boolean addArmor(Armor armor){
        if(armor.getWeight() + this.getWeight() <= this.getMaxWeight()){
            this.armors.add(armor);
            System.out.println("\n[Mensagem]Adicionado armadura\n "  + armor);
            return true;
        }
        System.out.println("\n[Aviso]Peso máximo excedido\n");
        return false;
    }

    public boolean addWeapon(Weapon weapon){
        //Se o peso, após adicionado a arma for maior que maxWeight, a lista weapons retorna ao seu estado inicial
        if(getWeight() + weapon.getWeight() <= maxWeight){
            System.out.println("\n[Mensagem]Adicionado weapon\n");
            this.weapons.add(weapon);
            return true;
        }
        System.out.println("\n[Aviso]Peso máximo excedido\n");
        return false;
    }

    public ArrayList<Consumable> getConsumables()
    {
        return consumables;
    }
    public void setConsumables(ArrayList<Consumable> consumables)
    {
        this.consumables = consumables;
    }

    public int getGold()
    {
        return gold;
    }

    public Armor getArmorEquiped() {
        return armorEquiped;
    }
    public Weapon getWeaponEquiped() {
        return weaponEquiped;
    }

    /**
     * O atributo weight é calculado somando todos as armaduras e armas que estão no inventario
     * @author Erik
     */
    public double getWeight()
    {
        weight = 0;

        //Peso de todas as armaduras
        for (Armor armor : armors) {
            weight += armor.getWeight();
        }
        //Peso de todas as armas
        for (Weapon weapon : weapons) {
            weight += weapon.getWeight();
        }
        return weight;
    }

    //IMPLEMENTACAO DE METODOS

    /**
     * This method receives an x amount of pos (gold equivalent) and subtracts it from the Inventory
     * true if the user can pay, else false
     * todo -> multiple kinds of currencies in game, and maybe allowing going into debt
     * @author kole
     */
    public boolean pay(int value){
        if(this.gold>=value){
            this.gold-=value;
            return true;
        }
        return false;
    }

    //Equipa armadura
    public boolean equipArmor(Armor armorToEquip){
        if(armors.contains(armorToEquip)){
            armorEquiped = armorToEquip;
            return true;
        }
        return false;
    }

    //Equipa arma
    public boolean equipWeapon(Weapon weaponToEquip){
        if(weapons.contains(weaponToEquip)){
            weaponEquiped = weaponToEquip;
            return true;
        }
        return false;
    }

    //Usa poção de mana
    public boolean useManaPotion(Adventurer adventurer){
        if(adventurer instanceof Mage){
            ((Mage) adventurer).setMana(((Mage) adventurer).getMana() + Consumable.MANA_POTION.getVal());
            adventurer.getInventory().getConsumables().remove(Consumable.MANA_POTION);
            return true;
        }
        return false;
    }

    //Usa poção de stamina
    public boolean useStaminaPotion(Adventurer adventurer){
        if(adventurer instanceof Rogue){
            ((Rogue) adventurer).setStamina(((Rogue) adventurer).getStamina() + Consumable.STAMINA_POTION.getVal());
            adventurer.getInventory().getConsumables().remove(Consumable.STAMINA_POTION);
            return true;
        }
        return false;
    }

    //Usa poção de adrenalina
    public boolean useAdrenalinePotion(Adventurer adventurer){
        if(adventurer instanceof Barbarian){
            ((Barbarian) adventurer).setRage(((Barbarian) adventurer).getRage() + Consumable.ADRENALINE_POTION.getVal());
            adventurer.getInventory().getConsumables().remove(Consumable.ADRENALINE_POTION);
            return true;
        }
        return false;
    }

    //ToString
    public String toString(){
        String out = "-=-=-=-=-=-=-=-=-INVENTORY-=-=-=-=-=-=-=-=-\n";
        out += "Armors:\n";
        for(Armor i : armors){
            //Se o armor equipado for printado o caracter antes do seu nome será "->"
            if(i == armorEquiped)
                out += "-> " + i + "\n";
            else
                out += "* " + i + "\n";
        }

        out += "Weapons:\n";
        for(Weapon i : weapons){
            if(i == weaponEquiped)
                //Se o weapon equipado for printado o caracter antes do seu nome será "->"
                out += "-> " + i + "\n";
            else
                out += "* " + i + "\n";
        }

//        out += "Consumable:\n";
//        for(Consumable i : consumables){
//            out += "* " + i ;
//        }

        out += "Peso do equipamento:\n" + getWeight() + "/" + getMaxWeight() + " kg";
        out += "\nGold : \n " + getGold() + "$";
        return out;
    }
}
