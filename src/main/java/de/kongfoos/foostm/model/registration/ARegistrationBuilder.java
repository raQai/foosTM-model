package de.kongfoos.foostm.model.registration;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.discipline.IDiscipline;
import de.kongfoos.foostm.model.team.ITeam;

public abstract class ARegistrationBuilder<R extends IRegistration, T extends ITeam> {

    private final T team;
    private List<? extends IDiscipline> disciplines = Collections.emptyList();
    private RegistrationStatus status = RegistrationStatus.OPEN;

    public ARegistrationBuilder(@NotNull T team) {
        this.team = team;
    }

    public ARegistrationBuilder<R, T> setDisciplines(@NotNull Collection<? extends IDiscipline> disciplines) {
        this.disciplines = (List<? extends IDiscipline>) disciplines;
        return this;
    }

    public ARegistrationBuilder<R, T> setStatus(@NotNull RegistrationStatus status) {
        this.status = status;
        return this;
    }

    protected abstract R getInstance();

    public R build() {
        final R registration = getInstance();
        registration.setTeam(team);
        disciplines.forEach(registration::addDiscipline);
        registration.setStatus(status);
        return registration;
    }
}
