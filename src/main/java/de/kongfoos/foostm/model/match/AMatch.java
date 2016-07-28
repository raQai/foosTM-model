package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.team.ATeam;

import javax.validation.constraints.NotNull;

public abstract class AMatch<T extends ATeam> implements IMatch<T> {

    @Override
    public T getWinner() {
        switch (getStatus()) {
            case WIN_TEAM_1:
                return getTeam1();
            case WIN_TEAM_2:
                return getTeam2();
            default:
                return null;
        }
    }

    @Override
    public void setWinner(@NotNull T team) {
        if (team.equals(getTeam1())) {
            setStatus(MatchStatus.WIN_TEAM_1);
        } else if (team.equals(getTeam2())) {
            setStatus(MatchStatus.WIN_TEAM_2);
        } else {
            throw new RuntimeException("Cannot set " + team + " as winner " +
                    "because it is not part of the match " + getTeam1() + " vs " + getTeam2());
        }
    }

    @Override
    public boolean isDraw() {
        return getStatus().equals(MatchStatus.DRAW);
    }

    @Override
    public void setDraw() {
        setStatus(MatchStatus.DRAW);
    }

    @Override
    public boolean isOpen() {
        return getStatus().equals(MatchStatus.OPEN);
    }

    @Override
    public void setOpen() {
        setStatus(MatchStatus.OPEN);
    }
}
