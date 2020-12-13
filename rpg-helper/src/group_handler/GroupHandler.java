package group_handler;

import model.adv_tier.Adventurer;

import java.util.ArrayList;
import java.util.List;

/**
 *  this class is planned to be used as the main event handling class when something affects the entire party
 *
 * @author kole
 */

public class GroupHandler {

    private final List<Adventurer> grupo = new ArrayList<>();
    private final String narratorName;

    public GroupHandler(String narratorName) {
        this.narratorName = narratorName;
    }

    public List<Adventurer> getGrupo() {
        return grupo;
    }
}
