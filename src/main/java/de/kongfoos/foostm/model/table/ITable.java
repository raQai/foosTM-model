package de.kongfoos.foostm.model.table;

import de.kongfoos.foostm.model.match.IMatch;

public interface ITable<M extends IMatch> {

    long getId();

    void setId(long id);

    int getNumber();

    void setNumber(int number);

    TableType getType();

    void setType(TableType type);

    M getMatch();

    void setMatch(M match);

    void removeMatch();

    boolean isFree();

}
