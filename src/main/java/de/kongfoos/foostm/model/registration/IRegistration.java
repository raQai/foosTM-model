package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.IDiscipline;
import de.kongfoos.foostm.model.team.ITeam;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

public interface IRegistration<T extends ITeam, D extends IDiscipline> {

    long getID();

    void setID(long id);

    T getTeam();

    void setTeam(@NotNull T team);

    List<D> getDisciplines();

    void setDisciplines(@NotNull Collection<D> disciplines);

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    RegistrationStatus getStatus();

    void setStatus(@NotNull RegistrationStatus status);
}
