package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.DisciplineImpl;
import de.kongfoos.foostm.model.team.TeamImpl;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

interface IRegistration<T extends TeamImpl, D extends DisciplineImpl> {

    T getTeam();

    void setTeam(@NotNull T team);

    List<D> getDisciplines();

    void setDisciplines(@NotNull Collection<D> disciplines);

    void clearDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    RegistrationStatus getStatus();

    void setStatus(@NotNull RegistrationStatus status);
}
