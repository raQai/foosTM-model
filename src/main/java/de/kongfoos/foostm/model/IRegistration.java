package de.kongfoos.foostm.model;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface IRegistration<T extends ITeam, D extends IDiscipline> {

    T getTeam();

    List<D> getDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    RegistrationStatus getStatus();

    void setStatus(@NotNull RegistrationStatus status);
}
