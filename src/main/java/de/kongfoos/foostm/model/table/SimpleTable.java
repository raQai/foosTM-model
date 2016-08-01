package de.kongfoos.foostm.model.table;

import de.kongfoos.foostm.model.match.SimpleMatch;

public class SimpleTable extends ATable<SimpleMatch> {
    private int number;
    private TableType type;
    private SimpleMatch match;

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
    public SimpleMatch getMatch() {
        return match;
    }

    @Override
    public void setMatch(SimpleMatch match) {
        this.match = match;
    }
}
