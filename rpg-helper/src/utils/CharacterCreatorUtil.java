package utils;

import enums.*;
import model.adv_tier.Adventurer;
import model.adv_tier.Attributes;
import model.barbarian.FuriousBarbarian;
import model.barbarian.TotemicBarbarian;
import model.mage.ArcaneMage;
import model.mage.FireMage;
import model.mage.FrostMage;
import model.rogue.ArcaneTrapperRogue;
import model.rogue.AssassinRogue;


public class CharacterCreatorUtil {


    public static Attributes getAttributesPoints(
        int chosenRace,
        int strength,
        int dexterity,
        int constitution,
        int intelligence,
        int wisdom,
        int charisma)
    {
        return new Attributes(
            strength + Race.values()[chosenRace].getStrength(),
            dexterity + Race.values()[chosenRace].getDexterity(),
            constitution + Race.values()[chosenRace].getConstitution(),
            intelligence + Race.values()[chosenRace].getIntelligence(),
            wisdom + Race.values()[chosenRace].getWisdom(),
            charisma + Race.values()[chosenRace].getCharisma()
        );
    }

    public static Adventurer createAdventurer(
        Attributes attributes,
        String characterName, 
        String playerName,
        int chosenClass,
        int chosenSubClass,
        int chosenHeight,
        int chosenWeight,
        int chosenRace,
        int chosenEyes,
        int chosenSkin,
        int chosenSex,
        int chosenHair
        )
    {
        if(chosenClass == 0 && chosenSubClass == 0)
        {
            return new FuriousBarbarian(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 0 && chosenSubClass == 1)
        {
            return new TotemicBarbarian(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 1 && chosenSubClass == 0)
        {
            return new FrostMage(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 1 && chosenSubClass == 1)
        {
            return new FireMage(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 1 && chosenSubClass == 2)
        {
            return new ArcaneMage(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else if(chosenClass == 2 && chosenSubClass == 0)
        {
            return new AssassinRogue(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
        else
        {
            return new ArcaneTrapperRogue(
                attributes,
                chosenHeight,
                chosenWeight,
                Hair.values()[chosenHair],
                Eyes.values()[chosenEyes],
                Race.values()[chosenRace],
                Sex.values()[chosenSex],
                Skin.values()[chosenSkin],
                playerName,
                characterName);
        }
    }
}