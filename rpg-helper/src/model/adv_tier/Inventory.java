package model.adv_tier;

import enums.Armor;
import enums.Consumable;
import enums.Weapon;
import model.barbarian.Barbarian;
import model.mage.Mage;
import model.rogue.Rogue;

import java.util.ArrayList;

public class Inventory {

    //todo : equip and get equipments automatically update the current weight of the inventory

    private ArrayList<Weapon> weapons;
    private ArrayList<Armor> armors;
    private ArrayList<Consumable> consumables;
    private Armor armorEquiped;
    private Weapon weaponEquiped;
    private int gold; // pecas de ouro
    private double weight;
    private double maxWeight;

    //CONSTRUTORES
    public Inventory(ArrayList<Weapon> weapons, ArrayList<Armor> armors, ArrayList<Consumable> consumables, int gold, int strenght) {
        /*É preciso instanciar as listas weapons, e armors com apenas um elemento "TEMP", pois o metodo setArmors/setWeapons
        precisa de getWeight. E não é possível usar getWeight em listas vazias.*/
        this.weapons = new ArrayList<Weapon>();
        this.armors = new ArrayList<Armor>();
        this.weapons.add(Weapon.TEMP);
        this.armors.add(Armor.TEMP);

        setArmors(armors);
        setWeapons(weapons);
        //Removendo os elementos nulos. Para que as listas fiquem com apenas os equipamentos do construtor
        this.weapons.remove(Weapon.TEMP);
        this.armors.remove(Armor.TEMP);

        this.consumables = consumables;
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

    public void addArmor(Armor armor){
        //Guarda os armors temporariamente em tempArmor
        ArrayList tempArmor = this.armors;
        this.armors.add(armor);

        //Se o peso, após adicionado a armadura for maior que maxWeight, a lista armors retorna ao seu estado inicial
        if(getWeight() < maxWeight){
            System.out.println("\n[Mensagem]Adicionado armadura\n");
            return;
        }
        this.armors = tempArmor;
        System.out.println("\n[Aviso]Peso máximo excedido\n");
    }
    public void addWeapon(Weapon weapon){
        //Guarda as armas temporariamente em tempWeapon
        ArrayList tempWeapon = this.weapons;
        this.weapons.add(weapon);

        //Se o peso, após adicionado a arma for maior que maxWeight, a lista weapons retorna ao seu estado inicial
        if(getWeight() < maxWeight){
            System.out.println("\n[Mensagem]Adicionado weapon\n");
            return;
        }
        this.weapons = tempWeapon;
        System.out.println("\n[Aviso]Peso máximo excedido\n");
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
     * @return
     */
    public double getWeight()
    {
        weight = 0;

        //Peso de todas as armaduras
        for (int i = 0; i < armors.size(); i++){
            weight += armors.get(i).getWeight();
        }
        //Peso de todas as armas
        for (int i = 0; i < weapons.size(); i++){
            weight += weapons.get(i).getWeight();
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
        if(this.gold>=value){
            this.gold-=value;
            return true;
        }
        return false;
    }

    //Equipa armadura
    public boolean equipArmor(Armor armor_to_equip){
        if(armors.contains(armor_to_equip)){
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

    //Usa poção de mana
    public void useManaPotion(Mage mage){
        mage.setMana(mage.getMana() + Consumable.MANA_POTION.getVal());
        mage.getInventory().getConsumables().remove(Consumable.MANA_POTION);
    }

    //Usa poção de stamina
    public void useStaminaPotion(Rogue rogue){
        rogue.setStamina(rogue.getStamina() + Consumable.STAMINA_POTION.getVal());
        rogue.getInventory().getConsumables().remove(Consumable.STAMINA_POTION);
    }

    //Usa poção de adrenalina
    public void useAdrenalinePotion(Barbarian barbarian){
        //É pra dar setRage msm? Não achei setAdrenaline ou um método parecido
        barbarian.setRage(barbarian.getRage() + Consumable.ADRENALINE_POTION.getVal());
        barbarian.getInventory().getConsumables().remove(Consumable.ADRENALINE_POTION);
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

        out += "\nPeso:\n" + getWeight() + "/" + getMaxWeight() + " kg";
        return out;
    }
}
