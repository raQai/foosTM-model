package de.kongfoos.foostm.model.table;

import de.kongfoos.foostm.model.match.MatchImpl;

public abstract class TableImpl<M extends MatchImpl> implements ITable<M> {
    @Override
    public void removeMatch() {
        setMatch(null);
    }

    @Override
    public boolean isFree() {
        return getMatch() == null;
    }
}
