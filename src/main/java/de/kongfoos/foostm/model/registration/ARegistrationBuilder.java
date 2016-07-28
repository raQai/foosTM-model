package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.ADiscipline;
import de.kongfoos.foostm.model.team.ATeam;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class ARegistrationBuilder<R extends ARegistration, T extends ATeam> {

    private final T team;
    private List<? extends ADiscipline> disciplines = Collections.emptyList();
    private RegistrationStatus status = RegistrationStatus.OPEN;

    public ARegistrationBuilder(@NotNull T team) {
        this.team = team;
    }

    public ARegistrationBuilder<R, T> setDisciplines(@NotNull Collection<? extends ADiscipline> disciplines) {
        this.disciplines = (List<? extends ADiscipline>) disciplines;
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
