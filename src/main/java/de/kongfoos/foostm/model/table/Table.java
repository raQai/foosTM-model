package de.kongfoos.foostm.model.table;

import de.kongfoos.foostm.model.match.Match;

public class Table<M extends Match> implements ITable<M> {

	private long id;
    private int number;
    private TableType type;
    private M match;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void removeMatch() {
        setMatch(null);
    }

    @Override
    public boolean isFree() {
        return getMatch() == null;
    }
    
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public TableType getType() {
        return type;
    }

    @Override
    public void setType(TableType type) {
        this.type = type;
    }

    @Override
    public M getMatch() {
        return match;
    }

    @Override
    public void setMatch(M match) {
        this.match = match;
    }
}
