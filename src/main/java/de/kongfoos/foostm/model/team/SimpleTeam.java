package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.SimplePlayer;

import javax.validation.constraints.NotNull;
import java.util.List;

public class SimpleTeam extends ATeam<SimplePlayer> {
    private List<SimplePlayer> players;
    private String name;
    private Type type;

    @Override
    public List<SimplePlayer> getPlayers() {
        return players;
    }

    @Override
    public boolean addPlayer(@NotNull SimplePlayer player) {
        return players.add(player);
    }

    @Override
    public boolean removePlayer(@NotNull SimplePlayer player) {
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
