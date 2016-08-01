package de.kongfoos.foostm.model.tournament;

import de.kongfoos.foostm.model.discipline.SimpleDiscipline;
import de.kongfoos.foostm.model.registration.SimpleRegistration;

import javax.validation.constraints.NotNull;
import java.util.List;

public class SimpleTournament extends ATournament<SimpleDiscipline, SimpleRegistration> {
    private List<SimpleDiscipline> disciplines;
    private List<SimpleRegistration> registrations;

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
    public List<SimpleRegistration> getRegistrations() {
        return registrations;
    }

    @Override
    public boolean addRegistration(@NotNull SimpleRegistration registration) {
        return registrations.add(registration);
    }

    @Override
    public boolean removeRegistration(@NotNull SimpleRegistration registration) {
        return registrations.remove(registration);
    }
}
