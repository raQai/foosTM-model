package de.kongfoos.foostm.model;

import java.util.Collection;

public abstract class GenericTournament<D extends Collection<? extends GenericDiscipline>, R extends Collection<? extends GenericRegistration>> {
    private final D disciplines;
    private final R registrations;

    public GenericTournament(D disciplines, R registrations) {
        this.disciplines = disciplines;
        this.registrations = registrations;
    }

    public D getDisciplines() {
        return disciplines;
    }

    public R getRegistrations() {
        return registrations;
    }
}
