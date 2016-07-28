package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.IPlayer;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

public interface ITeam<P extends IPlayer> {

    List<P> getPlayers();

    void setPlayers(@NotNull Collection<P> players);

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
