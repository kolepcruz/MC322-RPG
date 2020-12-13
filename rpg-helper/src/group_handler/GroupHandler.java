package group_handler;

import model.adv_tier.Adventurer;

import java.util.ArrayList;

/**
 *  this class is planned to be used as the main event handling class when something affects the entire party
 *
 * @author kole
 */

public class GroupHandler {

    private final ArrayList<Adventurer> grupo = new ArrayList<>();
    private final String narratorName;

    public GroupHandler(String narratorName) {
        this.narratorName = narratorName;
    }

    public ArrayList<Adventurer> getGrupo() {
        return grupo;
    }
}
