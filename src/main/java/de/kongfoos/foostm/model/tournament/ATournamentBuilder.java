package de.kongfoos.foostm.model.tournament;

import com.google.common.collect.Lists;
import de.kongfoos.foostm.model.discipline.ADiscipline;
import de.kongfoos.foostm.model.registration.ARegistration;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

public abstract class ATournamentBuilder<T extends ATournament> {
    private List<? extends ADiscipline> disciplines = Lists.newArrayList();
    private List<? extends ARegistration> registrations = Lists.newArrayList();

    protected ATournamentBuilder() {
    }

    public ATournamentBuilder<T> setDisciplines(@NotNull Collection<? extends ADiscipline> disciplines) {
        this.disciplines = (List<? extends ADiscipline>) disciplines;
        return this;
    }

    public ATournamentBuilder<T> setRegistrations(@NotNull Collection<? extends ARegistration> registrations) {
        this.registrations = (List<? extends ARegistration>) registrations;
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
