package de.kongfoos.foostm.model.team;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.player.Player;

@Entity(name = "team")
@Table(name = "team")
public class Team<P extends Player> implements ITeam<P> {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private long id;
	
	@OneToMany(targetEntity = Player.class)
    private List<P> players;
	
	@Column(name = "name")
    private String name;
    
	@Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void setPlayers(@NotNull Collection<P> players) {
        getPlayers().forEach(this::removePlayer);
        players.forEach(this::addPlayer);
    }
    
    @Override
    public List<P> getPlayers() {
        return players;
    }

    public boolean addPlayer(@NotNull P player) {
        return players.add(player);
    }

    public boolean removePlayer(@NotNull P player) {
        return players.remove(player);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(@NotNull Type type) {
        this.type = type;
    }

}
