package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.ADiscipline;
import de.kongfoos.foostm.model.team.ATeam;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public abstract class ARegistration<T extends ATeam, D extends ADiscipline> implements IRegistration<T, D> {
    @Override
    public void setDisciplines(@NotNull Collection<D> disciplines) {
        getDisciplines().forEach(this::removeDiscipline);
        disciplines.forEach(this::addDiscipline);
    }
}
