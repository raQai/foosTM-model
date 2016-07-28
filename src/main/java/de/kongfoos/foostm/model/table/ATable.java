package de.kongfoos.foostm.model.table;

import de.kongfoos.foostm.model.match.AMatch;

public abstract class ATable<M extends AMatch> implements ITable<M> {

    private long id;

    @Override
    public long getID() {
        return id;
    }

    @Override
    public void setID(long id) {
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
}
