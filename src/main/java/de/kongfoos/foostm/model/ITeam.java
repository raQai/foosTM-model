package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.player.IPlayer;

import java.util.Collection;

public interface ITeam<P extends IPlayer> {
    Collection<P> getPlayers();

    Type getType();

    String getName();

    void setName(String name);
}
