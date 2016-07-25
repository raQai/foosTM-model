package de.kongfoos.foostm.model;

import com.google.common.collect.Lists;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

public class Registration {
    private final Team team;

    private final List<Discipline> disciplines = Lists.newArrayList();
    private RegistrationStatus status = RegistrationStatus.OPEN;

    public Registration(@NotNull Team team, @NotNull Collection<Discipline> disciplines) {
        this.team = team;
        this.disciplines.addAll(disciplines);
    }

    public Team getTeam() {
        return team;
    }

    public RegistrationStatus getStatus() {
        return status;
    }

    public void setStatus(RegistrationStatus status) {
        this.status = status;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void addDiscipline(@NotNull Discipline discipline) {
        if (!this.disciplines.contains(discipline)) {
            this.disciplines.add(discipline);
            setStatus(RegistrationStatus.REGISTERED);
        }
    }

    public void removeDiscipline(@NotNull Discipline discipline) {
        disciplines.remove(discipline);
        if (disciplines.isEmpty()) {
            setStatus(RegistrationStatus.OPEN);
        }
    }
}
