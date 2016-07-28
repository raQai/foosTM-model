package de.kongfoos.foostm.model.team;

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

@Entity
//@MappedSuperclass
@Table(name="team")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public interface ITeam<P extends IPlayer> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tid")
	long getId();
	
	void setId(long id);
	
	@OneToMany(targetEntity=IPlayer.class)
//	@JoinColumn(name="pid", referencedColumnName="tid")
    List<P> getPlayers();
	
	void setPlayers(List<P> players);

	@Transient
    void addPlayer(@NotNull P player);

	@Transient
    void removePlayer(@NotNull P player);

    @Column(name="name")
    String getName();

    void setName(String name);

    @Enumerated(EnumType.STRING)
    Type getType();

    void setType(@NotNull Type type);

    @Transient
    boolean isSingles();

    @Transient
    boolean isDoubles();

    @Transient
    boolean isTeam();
}
