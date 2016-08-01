package de.kongfoos.foostm.model.match;

import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.player.Player;
import de.kongfoos.foostm.model.team.Team;

public class Match<T extends Team<? extends Player>> implements IMatch<T> {

	private long id;
    private T team1;
    private T team2;
    private MatchStatus status;


    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

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
    
    @Override
    public T getTeam1() {
        return team1;
    }

    @Override
    public void setTeam1(@NotNull T team) {
        this.team1 = team;
    }

    @Override
    public T getTeam2() {
        return team2;
    }

    @Override
    public void setTeam2(@NotNull T team) {
        this.team2 = team;
    }

    @Override
    public MatchStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(@NotNull MatchStatus status) {
        this.status = status;
    }
}
