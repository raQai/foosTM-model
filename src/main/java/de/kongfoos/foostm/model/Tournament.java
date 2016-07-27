package de.kongfoos.foostm.model;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import javax.validation.constraints.NotNull;
import java.util.List;

@Deprecated
public class Tournament {
    private final List<Discipline> disciplines = Lists.newArrayList();
    private final List<Registration> registrations = Lists.newArrayList();

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void addDiscipline(@NotNull Discipline discipline) {
        Preconditions.checkArgument(disciplines.stream().noneMatch(d -> d.equals(discipline)),
                "Discipline " + discipline.getShortName() + " already in use");
        disciplines.add(discipline);
    }

    public void removeDiscipline(@NotNull Discipline discipline) {
        // TODO await confirmation because all teams will be deleted
        disciplines.remove(discipline);
    }

    public void addRegistration(@NotNull Registration registration) {
        registrations.add(registration);
    }

    public List<? extends Registration> getRegistrations() {
        return registrations;
    }
}
