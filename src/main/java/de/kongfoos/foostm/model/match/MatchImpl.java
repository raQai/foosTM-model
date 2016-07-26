package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.ITeam;
import de.kongfoos.foostm.model.table.ITable;

public abstract class MatchImpl<T extends ITeam, P extends ITable> implements IMatch<T, P> {
    public void setTeam1Wins() {
        setStatus(MatchStatus.WIN_TEAM_1);
    }

    public void setTeam2Wins() {
        setStatus(MatchStatus.WIN_TEAM_2);
    }

    public void setDraw() {
        setStatus(MatchStatus.DRAW);
    }
}
