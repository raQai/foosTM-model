package de.kongfoos.foostm.model.tournament;

import de.kongfoos.foostm.model.discipline.DisciplineImpl;
import de.kongfoos.foostm.model.registration.RegistrationImpl;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

interface ITournament<D extends DisciplineImpl, R extends RegistrationImpl> {

    List<D> getDisciplines();

    void setDisciplines(@NotNull Collection<D> disciplines);

    void clearDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    List<R> getRegistrations();

    void setRegistrations(@NotNull Collection<R> registrations);

    void clearRegistrations();

    boolean addRegistration(@NotNull R registration);

    boolean removeRegistration(@NotNull R registration);
}
