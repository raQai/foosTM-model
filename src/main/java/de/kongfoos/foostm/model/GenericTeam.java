package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.player.GenericPlayer;

import java.util.Collection;

public abstract class GenericTeam<P extends Collection<? extends GenericPlayer>, A, S> implements ICanHasInit {
    private final P players;
    private final A type;
    private S name;

    protected GenericTeam(P players, A type) {
        this.players = players;
        this.type = type;
    }

    public P getPlayers() {
        return players;
    }

    public A getType() {
        return type;
    }

    public S getName() {
        return name;
    }

    public abstract void setName(String name);
}
