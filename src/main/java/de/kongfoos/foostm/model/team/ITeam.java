package de.kongfoos.foostm.model.team;

import java.util.Collection;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.player.IPlayer;
import de.kongfoos.foostm.model.player.Player;

public interface ITeam<P extends IPlayer> {

    long getId();

    void setId(long id);

    List<P> getPlayers();

//    void setPlayers(@NotNull Collection<P> players);

    boolean addPlayer(@NotNull P player);

    boolean removePlayer(@NotNull P player);

    String getName();

    void setName(String name);

    Type getType();

    void setType(@NotNull Type type);

	void setPlayers(Collection<P> players);

}
