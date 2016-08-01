package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.team.ITeam;

public abstract class AMatchBuilder<M extends IMatch, T extends ITeam> {

    private final T team1;
    private final T team2;

    protected AMatchBuilder(T team1, T team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    protected abstract M getInstance();

    public M build() {
        final M match = getInstance();
        match.setTeam1(team1);
        match.setTeam2(team2);
        match.setStatus(MatchStatus.OPEN);
        return match;
    }
}
