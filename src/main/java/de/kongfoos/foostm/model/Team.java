package de.kongfoos.foostm.model;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import de.kongfoos.foostm.model.player.Player;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Team {
    private final List<Player> players;
    private final Type type;
    private String name;

    protected Team(List<Player> players, Type type) {
        this.players = players;
        this.type = type;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        private final List<Player> players;
        private final Type type;
        private String name;

        public Builder(@NotNull List<Player> players, Type type) {
            Preconditions.checkArgument(!players.isEmpty(), "Empty player list not allowed");
            this.players = players;
            this.type = type;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Team build() {
            final Team team = new Team(players, type);
            if (Strings.isNullOrEmpty(name)) {
                name(Joiner.on(" / ").join(players));
            }
            team.setName(this.name);
            return team;
        }
    }
}
