package de.kongfoos.foostm.model.tournament;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.google.common.collect.Lists;

import de.kongfoos.foostm.model.discipline.IDiscipline;
import de.kongfoos.foostm.model.registration.IRegistration;

public abstract class ATournamentBuilder<T extends ITournament> {
    private List<? extends IDiscipline> disciplines = Lists.newArrayList();
    private List<? extends IRegistration> registrations = Lists.newArrayList();

    protected ATournamentBuilder() {
    }

    public ATournamentBuilder<T> setDisciplines(@NotNull Collection<? extends IDiscipline> disciplines) {
        this.disciplines = (List<? extends IDiscipline>) disciplines;
        return this;
    }

    public ATournamentBuilder<T> setRegistrations(@NotNull Collection<? extends IRegistration> registrations) {
        this.registrations = (List<? extends IRegistration>) registrations;
        return this;
    }

    protected abstract T getIntance();

    public T build() {
        final T tournament = getIntance();
        disciplines.forEach(tournament::addDiscipline);
        registrations.forEach(tournament::addRegistration);
        return tournament;
    }
}
