package model.adv_tier;

import enums.*;
import model.Person;
import model.barbarian.Barbarian;
import model.mage.Mage;
import utils.RandomUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Adventurer extends Person{
    /**
     * Class Adventurer armazena as informações do aventureiro
     * nessa classe contem informarções que vão ser aprimoradas no Projeto 2 e que já são usadas atualmente para criação do aventureiro
     */

    private static int numAdventurers; //counts how many adventurers are there

    private int id;
    private int level;
    private int expPoints;
    private CombatAttributes combatAttributes;
    private Inventory inventory;
    private Attributes attributes;

    //instancia cada tipo de aventureiro com seu equipamento normal
    public Adventurer(Attributes attributes, double height, double weight, Hair hair, Eyes eyes, Race race, Sex sex,
                      Skin skin, String playerName, String caracterName)
    {
        super(height,weight,hair,eyes,race,sex,skin,playerName,caracterName);
        this.attributes = attributes;

        if(this instanceof Barbarian){
            this.inventory = new Inventory( new ArrayList<Weapon>(Arrays.asList(Weapon.AXE_BIG)),
                                            new ArrayList<Armor>(Arrays.asList(Armor.BEATEN_LEATHER)),
                                            RandomUtil.getInitialGold(2,4),
                                            attributes.getTotalStrenght());
            this.inventory.equipArmor(Armor.BEATEN_LEATHER);
            this.inventory.equipWeapon(Weapon.AXE_BIG);
            this.combatAttributes = new CombatAttributes(attributes,this.inventory.getArmorEquiped(),12);
        }
        else if ( this instanceof Mage){
            this.inventory = new Inventory( new ArrayList<Weapon>(Arrays.asList(Weapon.NO_WEAPON)),
                                            new ArrayList<Armor>(Arrays.asList(Armor.NO_ARMOR)),
                                            RandomUtil.getInitialGold(4,4),
                                            attributes.getTotalStrenght());
            this.inventory.equipArmor(Armor.NO_ARMOR);
            this.inventory.equipWeapon(Weapon.NO_WEAPON);
            this.combatAttributes = new CombatAttributes(attributes,this.inventory.getArmorEquiped(),6);

        }
        else {
            this.inventory = new Inventory( new ArrayList<Weapon>(Arrays.asList(Weapon.DAGGER)),
                                            new ArrayList<Armor>(Arrays.asList(Armor.PADDED)),
                                            RandomUtil.getInitialGold(4, 4),
                                            attributes.getTotalStrenght());
            this.inventory.equipArmor(Armor.PADDED);
            this.inventory.equipWeapon(Weapon.DAGGER);
            this.combatAttributes = new CombatAttributes(attributes,this.inventory.getArmorEquiped(),8);
        }

        ++numAdventurers;
        this.id = numAdventurers;
        this.level = 0;
        this.expPoints = 0;
    }

    @Override
    public String toString() {
        return "Adventurer :" +
                "\n id = " + id +
                "\n level = " + level +
                "\n expPoints = " + expPoints +
                "\n" + combatAttributes +
                "\n" + inventory +
                "\n "  + attributes +
                super.toString();
    }

    public static int getNumAdventurers() {
        return numAdventurers;
    }
    private static void setNumAdventurers(int numAdventurers) {
        Adventurer.numAdventurers = numAdventurers;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Attributes getAtributos() {
        return attributes;
    }
    public void setAtributos(Attributes attributes) {
        this.attributes = attributes;
    }

    public CombatAttributes getCombate() {
        return combatAttributes;
    }
    public void setCombate(CombatAttributes combatAttributes) {
        this.combatAttributes = combatAttributes;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getExpPoints() {
        return expPoints;
    }
    public void setExpPoints(int expPoints) {
        this.expPoints = expPoints;
    }

    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
