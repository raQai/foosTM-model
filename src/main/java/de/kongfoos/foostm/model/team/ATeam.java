package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.APlayer;

public abstract class ATeam<P extends APlayer> implements ITeam<P>{
    @Override
    public boolean isSingles() {
        return getType().equals(Type.SINGLES);
    }

    @Override
    public boolean isDoubles() {
        return getType().equals(Type.DOUBLES);
    }

    @Override
    public boolean isTeam() {
        return getType().equals(Type.TEAM);
    }
}
