package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.Team;
import de.kongfoos.foostm.model.table.Table;

public class Match {
    private final Team team1;
    private final Team team2;
    private Table table;
    private Team winner;
    private MatchStatus status;

    public Match(Team team2, Team team1) {
        this.team2 = team2;
        this.team1 = team1;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
        setStatus(table == null ? MatchStatus.OPEN : MatchStatus.ACTIVE);
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
        if (winner != null) {
            setStatus(MatchStatus.DECIDED);
        }
    }

    public void setDraw() {
        setStatus(MatchStatus.DECIDED);
    }

    public MatchStatus getStatus() {
        return status;
    }

    private void setStatus(MatchStatus status) {
        this.status = status;
    }
}
