package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.ITeam;
import de.kongfoos.foostm.model.table.ITable;

import javax.validation.constraints.NotNull;

public interface IMatch<T extends ITeam, P extends ITable> {

    T getTeam1();

    T getTeam2();

    P getTable();

    void setTable(P table);

    T getWinner();

    void setWinner(@NotNull T winner);

    void setTeam1Wins();

    void setTeam2Wins();

    void setDraw();

    void isDraw();

    MatchStatus getStatus();

    void setStatus(@NotNull MatchStatus status);
}
