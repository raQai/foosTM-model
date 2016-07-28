package de.kongfoos.foostm.model.table;

import de.kongfoos.foostm.model.match.AMatch;

public abstract class ATable<M extends AMatch> implements ITable<M> {
    @Override
    public void removeMatch() {
        setMatch(null);
    }

    @Override
    public boolean isFree() {
        return getMatch() == null;
    }
}
