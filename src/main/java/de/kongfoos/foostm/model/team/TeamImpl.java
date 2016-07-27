package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.PlayerImpl;

public abstract class TeamImpl<P extends PlayerImpl> implements ITeam<P>{
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
