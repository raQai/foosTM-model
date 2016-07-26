package de.kongfoos.foostm.model;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public interface ITournament<D extends DisciplineImpl, R extends IRegistration> {

    Collection<D> getDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    Collection<R> getRegistrations();

    boolean addRegistration(@NotNull R registration);

    boolean removeRegistration(@NotNull R registration);
}
