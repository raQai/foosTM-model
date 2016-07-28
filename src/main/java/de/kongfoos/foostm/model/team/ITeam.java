package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.PlayerImpl;

import javax.validation.constraints.NotNull;
import java.util.List;

interface ITeam<P extends PlayerImpl> {

    List<P> getPlayers();

    void addPlayer(@NotNull P player);

    void removePlayer(@NotNull P player);

    String getName();

    void setName(String name);

    Type getType();

    void setType(@NotNull Type type);

    boolean isSingles();

    boolean isDoubles();

    boolean isTeam();
}
