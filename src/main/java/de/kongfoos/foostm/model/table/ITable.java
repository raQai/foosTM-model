package de.kongfoos.foostm.model.table;

import de.kongfoos.foostm.model.match.MatchImpl;

interface ITable<M extends MatchImpl> {

    int getID();

    void setID(int number);

    TableType getType();

    void setType(TableType type);

    M getMatch();

    void setMatch(M match);

    void removeMatch();

    boolean isFree();

}
