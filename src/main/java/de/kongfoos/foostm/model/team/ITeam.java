package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.IPlayer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Entity
//@MappedSuperclass
@Table(name = "team")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public interface ITeam<P extends IPlayer> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tid")
    long getId();

    void setId(long id);

    @OneToMany(targetEntity = IPlayer.class)
//	@JoinColumn(name="pid", referencedColumnName="tid")
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

    @Transient
    boolean isSingles();

    @Transient
    boolean isDoubles();

    @Transient
    boolean isTeam();
}
