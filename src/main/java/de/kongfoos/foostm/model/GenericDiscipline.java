package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.match.GenericMatch;
import de.kongfoos.foostm.model.table.GenericTable;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.function.Predicate;

public abstract class GenericDiscipline<P extends Collection<Predicate<? extends GenericTeam>>,
        T extends Collection<? extends GenericTeam>,
        M extends Collection<? extends GenericMatch>,
        L extends Collection<? extends GenericTable>, S, A> implements ICanHasInit {
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

    public abstract void setParticipationRules(@NotNull Collection<Predicate<? extends GenericTeam>> participationRules);

    public abstract void addParticipationRules(@NotNull Predicate<? extends GenericTeam> participationRules);

    public T getTeams() {
        return teams;
    }

    public abstract boolean addTeams(@NotNull Collection<? extends GenericTeam> teams);

    public abstract boolean removeTeams(@NotNull Collection<? extends GenericTeam> teams);

    public M getMatches() {
        return matches;
    }

    public abstract boolean addMatches(@NotNull Collection<? extends GenericMatch> matches);

    public abstract boolean removeMatches(@NotNull Collection<? extends GenericMatch> matches);

    public L getTables() {
        return tables;
    }

    public abstract boolean addTables(@NotNull Collection<? extends GenericTable> tables);

    public abstract boolean removeTables(@NotNull Collection<? extends GenericTable> tables);

    public A getType() {
        return type;
    }

    public abstract void setType(@NotNull Type type);

    public abstract boolean allowsParticipation(@NotNull Collection<? extends GenericTeam> team);

    public abstract boolean isSingles();

    public abstract boolean isDoubles();

    public abstract boolean isTeam();

    @Override
    public abstract boolean equals(Object obj);
}
