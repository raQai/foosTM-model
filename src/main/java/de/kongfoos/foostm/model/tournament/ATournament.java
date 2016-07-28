package de.kongfoos.foostm.model.tournament;

import de.kongfoos.foostm.model.discipline.ADiscipline;
import de.kongfoos.foostm.model.registration.ARegistration;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public abstract class ATournament<D extends ADiscipline, R extends ARegistration> implements ITournament<D, R> {

    private long id;

    @Override
    public long getID() {
        return id;
    }

    @Override
    public void setID(long id) {
        this.id = id;
    }

    @Override
    public void setDisciplines(@NotNull Collection<D> disciplines) {
        getDisciplines().forEach(this::removeDiscipline);
        disciplines.forEach(this::addDiscipline);
    }

    @Override
    public void setRegistrations(@NotNull Collection<R> registrations) {
        getRegistrations().forEach(this::removeRegistration);
        registrations.forEach(this::addRegistration);
    }
}
