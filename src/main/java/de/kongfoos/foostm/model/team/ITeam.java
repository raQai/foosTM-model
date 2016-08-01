package de.kongfoos.foostm.model.team;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.player.IPlayer;

public interface ITeam<P extends IPlayer> {

    long getId();

    void setId(long id);

    List<P> getPlayers();

    void setPlayers(@NotNull Collection<P> players);

    boolean addPlayer(@NotNull P player);

    boolean removePlayer(@NotNull P player);

    String getName();

    void setName(String name);

    Type getType();

    void setType(@NotNull Type type);

}
