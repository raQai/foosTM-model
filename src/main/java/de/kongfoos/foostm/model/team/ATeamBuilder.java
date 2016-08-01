package de.kongfoos.foostm.model.team;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import de.kongfoos.foostm.model.player.IPlayer;

public abstract class ATeamBuilder<T extends ITeam, P extends IPlayer> {

    private final List<P> players = Lists.newArrayList();
    private final Type type;
    private String name;

    protected ATeamBuilder(@NotNull Collection<P> players, @NotNull Type type) {
        this.players.addAll(players);
        this.type = type;
    }

    public ATeamBuilder<T, P> name(String name) {
        this.name = name;
        return this;
    }

    protected abstract T getInstance();

    public T build() {
        final T team = getInstance();
        players.forEach(team::addPlayer);
        team.setType(type);
        if (!type.equals(Type.TEAM)) {
            team.setName(Joiner.on(" / ").join(players));
        } else {
            team.setName(name);
        }
        return team;
    }
}
