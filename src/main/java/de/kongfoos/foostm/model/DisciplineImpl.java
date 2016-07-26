package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.match.IMatch;
import de.kongfoos.foostm.model.table.ITable;

public abstract class DisciplineImpl<T extends ITeam, M extends IMatch<T, P>, P extends ITable> implements IDiscipline<T, M, P> {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof DisciplineImpl &&
                (getName().toLowerCase().equals(((DisciplineImpl) obj).getName().toLowerCase()) ||
                        getShortName().toLowerCase().equals(((DisciplineImpl) obj).getShortName().toLowerCase()));
    }
}
