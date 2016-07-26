package de.kongfoos.foostm.model;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface ITournament<D extends DisciplineImpl, R extends IRegistration> {

    List<D> getDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    List<R> getRegistrations();

    boolean addRegistration(@NotNull R registration);

    boolean removeRegistration(@NotNull R registration);
}
