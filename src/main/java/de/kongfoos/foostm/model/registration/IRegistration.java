package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.DisciplineImpl;
import de.kongfoos.foostm.model.team.TeamImpl;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface IRegistration<T extends TeamImpl, D extends DisciplineImpl> {

    T getTeam();

    List<D> getDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    RegistrationStatus getStatus();

    void setStatus(@NotNull RegistrationStatus status);
}
