package de.kongfoos.foostm.model;

import com.google.common.collect.Lists;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

public abstract class GenericRegistration<T extends GenericTeam, D extends Collection<? extends GenericDiscipline>, R> {
    private final T team;
    private D disciplines;

    private R status;

    public GenericRegistration(@NotNull T team) {
        this.team = team;
    }

    public T getTeam() {
        return team;
    }

    public D getDisciplines() {
        return disciplines;
    }

    public abstract void setDisciplines(D disciplines);

    public R getStatus() {
        return status;
    }

    public abstract void setStatus(R status);
}
