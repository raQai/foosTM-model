package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.team.SimpleTeam;

import javax.validation.constraints.NotNull;

public class SimpleMatch extends AMatch<SimpleTeam> {
    private SimpleTeam team1;
    private SimpleTeam team2;
    private MatchStatus status;

    @Override
    public SimpleTeam getTeam1() {
        return team1;
    }

    @Override
    public void setTeam1(@NotNull SimpleTeam team) {
        this.team1 = team;
    }

    @Override
    public SimpleTeam getTeam2() {
        return team2;
    }

    @Override
    public void setTeam2(@NotNull SimpleTeam team) {
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
