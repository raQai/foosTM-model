package de.kongfoos.foostm.model.registration;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.discipline.IDiscipline;
import de.kongfoos.foostm.model.player.IPlayer;
import de.kongfoos.foostm.model.team.ITeam;

public interface IRegistration<T extends ITeam<? extends IPlayer>, D extends IDiscipline> {

    long getId();

    void setId(long id);

    T getTeam();

    void setTeam(@NotNull T team);

    List<D> getDisciplines();

    void setDisciplines(@NotNull Collection<D> disciplines);

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    RegistrationStatus getStatus();

    void setStatus(@NotNull RegistrationStatus status);
}
