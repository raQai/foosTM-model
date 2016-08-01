package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.IPlayer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "team")
@Access(AccessType.PROPERTY)
public interface ITeam<P extends IPlayer> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    long getId();

    void setId(long id);

    @OneToMany(targetEntity = IPlayer.class)
//  FIXME is @Column(name = "players") needed here?
    List<P> getPlayers();

    void setPlayers(@NotNull Collection<P> players);

    @Transient
    boolean addPlayer(@NotNull P player);

    @Transient
    boolean removePlayer(@NotNull P player);

    @Column(name = "name")
    String getName();

    void setName(String name);

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    Type getType();

    void setType(@NotNull Type type);

}
