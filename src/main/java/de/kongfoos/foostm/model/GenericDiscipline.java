package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.match.GenericMatch;
import de.kongfoos.foostm.model.table.GenericTable;

import java.util.Collection;
import java.util.function.Predicate;

public abstract class GenericDiscipline<P extends Collection<Predicate<? extends GenericTeam>>,
        T extends Collection<? extends GenericTeam>,
        M extends Collection<? extends GenericMatch>,
        L extends Collection<? extends GenericTable>, S, A> {
    private final S name;
    private final S shortName;
    private P participationRules;
    private T teams;
    private M matches;
    private L tables;
    private A type;

    private GenericDiscipline(S name, S shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public S getName() {
        return name;
    }

    public S getShortName() {
        return shortName;
    }

    public P getParticipationRules() {
        return participationRules;
    }

    public void setParticipationRules(P participationRules) {
        this.participationRules = participationRules;
    }

    public T getTeams() {
        return teams;
    }

    public void setTeams(T teams) {
        this.teams = teams;
    }

    public M getMatches() {
        return matches;
    }

    public void setMatches(M matches) {
        this.matches = matches;
    }

    public L getTables() {
        return tables;
    }

    public void setTables(L tables) {
        this.tables = tables;
    }

    public A getType() {
        return type;
    }

    public abstract void setType(A type);

    public abstract boolean allowsParticipation(Collection<? extends GenericTeam> team);

    public abstract boolean isSingles();

    public abstract boolean isDoubles();

    public abstract boolean isTeam();

    @Override
    public abstract boolean equals(Object obj);
}
