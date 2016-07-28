package de.kongfoos.foostm.model.tournament;

import de.kongfoos.foostm.model.discipline.IDiscipline;
import de.kongfoos.foostm.model.registration.IRegistration;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

public interface ITournament<D extends IDiscipline, R extends IRegistration> {

    long getID();

    void setID(long id);

    List<D> getDisciplines();

    void setDisciplines(@NotNull Collection<D> disciplines);

    boolean addDiscipline(@NotNull D discipline);

    boolean removeDiscipline(@NotNull D discipline);

    List<R> getRegistrations();

    void setRegistrations(@NotNull Collection<R> registrations);

    boolean addRegistration(@NotNull R registration);

    boolean removeRegistration(@NotNull R registration);
}
