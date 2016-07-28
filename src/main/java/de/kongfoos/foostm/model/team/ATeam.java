package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.APlayer;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public abstract class ATeam<P extends APlayer> implements ITeam<P>{

    @Override
    public void setPlayers(@NotNull Collection<P> players) {
        getPlayers().forEach(this::removePlayer);
        players.forEach(this::addPlayer);
    }

}
