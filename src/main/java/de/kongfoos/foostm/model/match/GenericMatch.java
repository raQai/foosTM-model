package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.GenericTeam;
import de.kongfoos.foostm.model.ICanHasInit;
import de.kongfoos.foostm.model.table.GenericTable;

public abstract class GenericMatch<T extends GenericTeam, L extends GenericTable, M> implements ICanHasInit {
    private final T team1;
    private final T team2;
    private T winner;
    private L table;
    private M status;

    protected GenericMatch(T team1, T team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public T getTeam1() {
        return team1;
    }

    public T getTeam2() {
        return team2;
    }

    public L getTable() {
        return table;
    }

    public abstract void setTable(L table);

    public T getWinner() {
        return winner;
    }

    public abstract void setWinner(T winner);

    public M getStatus() {
        return status;
    }

    public abstract void setStatus(M status);

    public abstract void setDraw();
}
