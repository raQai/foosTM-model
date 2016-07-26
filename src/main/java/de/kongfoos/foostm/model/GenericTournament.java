package de.kongfoos.foostm.model;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public abstract class GenericTournament<D extends Collection<? extends GenericDiscipline>,
        R extends Collection<? extends GenericRegistration>> implements ICanHasInit {
    private D disciplines;
    private R registrations;

    public D getDisciplines() {
        return disciplines;
    }

    public abstract boolean addDisciplines(@NotNull Collection<? extends GenericDiscipline> disciplines);

    public abstract boolean removeDisciplines(@NotNull Collection<? extends GenericDiscipline> disciplines);

    public R getRegistrations() {
        return registrations;
    }

    public abstract boolean addRegistrations(@NotNull Collection<? extends GenericRegistration> registrations);

    public abstract boolean removeRegistrations(@NotNull Collection<? extends GenericRegistration> registrations);
}
