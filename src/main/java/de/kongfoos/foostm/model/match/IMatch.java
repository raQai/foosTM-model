package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.ITeam;
import de.kongfoos.foostm.model.table.ITable;

import javax.validation.constraints.NotNull;

interface IMatch<T extends ITeam, P extends ITable> {

    T getTeam1();

    T getTeam2();

    P getTable();

    void setTable(P table);

    MatchStatus getStatus();

    void setStatus(@NotNull MatchStatus status);
}
