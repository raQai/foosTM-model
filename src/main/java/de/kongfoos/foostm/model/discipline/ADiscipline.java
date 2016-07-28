package de.kongfoos.foostm.model.discipline;

import de.kongfoos.foostm.model.match.AMatch;
import de.kongfoos.foostm.model.table.ATable;
import de.kongfoos.foostm.model.team.ATeam;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class ADiscipline<T extends ATeam, M extends AMatch<T>, P extends ATable<M>>
        implements IDiscipline<T, M, P> {

    private long id;

    @Override
    public long getID() {
        return id;
    }

    @Override
    public void setID(long id) {
        this.id = id;
    }

    @Override
    public void setPatricipationRules(@NotNull Collection<Predicate<T>> predicates) {
        getParticipationRules().forEach(this::removeRule);
        predicates.forEach(this::addRule);
    }

    @Override
    public boolean allowsParticipation(@NotNull T team) {
        return getParticipationRules().stream().allMatch(p -> p.test(team));
    }

    @Override
    public void setTeams(@NotNull Collection<T> teams) {
        getTeams().forEach(this::removeTeam);
        teams.forEach(this::addTeam);
    }

    @Override
    public List<T> getTeams(@NotNull Predicate<T> predicate) {
        return getTeams().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public void setMatches(@NotNull Collection<M> matches) {
        getMatches().forEach(this::removeMatch);
        matches.forEach(this::addMatch);
    }

    @Override
    public List<M> getOpenMatches() {
        return getMatches().stream().filter(AMatch::isOpen).collect(Collectors.toList());
    }

    @Override
    public void setTables(@NotNull Collection<P> tables) {
        getTables().forEach(this::removeTable);
        tables.forEach(this::addTable);
    }

    @Override
    public List<P> getFreeTables() {
        return getTables().stream().filter(ATable::isFree).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ADiscipline &&
                (getName().toLowerCase().equals(((ADiscipline) obj).getName().toLowerCase()) ||
                        getShortName().toLowerCase().equals(((ADiscipline) obj).getShortName().toLowerCase()));
    }
}
