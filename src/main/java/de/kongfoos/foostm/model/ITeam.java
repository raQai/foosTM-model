package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.player.IPlayer;

import java.util.List;

public interface ITeam<P extends IPlayer> {
    List<P> getPlayers();

    Type getType();

    String getName();

    void setName(String name);
}
