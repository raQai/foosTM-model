package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.SimpleDiscipline;
import de.kongfoos.foostm.model.team.SimpleTeam;

import javax.validation.constraints.NotNull;
import java.util.List;

public class SimpleRegistration extends ARegistration<SimpleTeam, SimpleDiscipline> {
    private SimpleTeam team;
    private List<SimpleDiscipline> disciplines;
    private RegistrationStatus status;

    @Override
    public SimpleTeam getTeam() {
        return team;
    }

    @Override
    public void setTeam(@NotNull SimpleTeam team) {
        this.team = team;
    }

    @Override
    public List<SimpleDiscipline> getDisciplines() {
        return disciplines;
    }

    @Override
    public boolean addDiscipline(@NotNull SimpleDiscipline discipline) {
        return disciplines.add(discipline);
    }

    @Override
    public boolean removeDiscipline(@NotNull SimpleDiscipline discipline) {
        return disciplines.remove(discipline);
    }

    @Override
    public RegistrationStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(@NotNull RegistrationStatus status) {
        this.status = status;
    }
}
