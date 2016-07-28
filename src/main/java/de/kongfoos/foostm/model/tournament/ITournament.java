package de.kongfoos.foostm.model.tournament;

import de.kongfoos.foostm.model.discipline.DisciplineImpl;
import de.kongfoos.foostm.model.registration.RegistrationImpl;

import javax.validation.constraints.NotNull;
import java.util.List;

interface ITournament<D extends DisciplineImpl, R extends RegistrationImpl> {

    List<D> getDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    List<R> getRegistrations();

    boolean addRegistration(@NotNull R registration);

    boolean removeRegistration(@NotNull R registration);
}
