package de.kongfoos.foostm.model;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public interface IRegistration<T extends ITeam, D extends IDiscipline> {

    T getTeam();

    Collection<D> getDisciplines();

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    RegistrationStatus getStatus();

    void setStatus(@NotNull RegistrationStatus status);
}
