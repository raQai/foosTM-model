package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.match.IMatch;
import de.kongfoos.foostm.model.table.ITable;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.function.Predicate;

interface IDiscipline<T extends ITeam, M extends IMatch<T, P>, P extends ITable> {

    String getName();

    String getShortName();

    Collection<Predicate<T>> getParticipationRules();

    void addParticipationRules(@NotNull Predicate<T> participationRules);

    boolean allowsParticipation(@NotNull T team);

    Collection<T> getTeams();

    boolean addTeam(@NotNull T team);

    boolean removeTeam(@NotNull T team);

    Collection<M> getMatches();

    boolean addMatch(@NotNull M match);

    boolean removeMatch(@NotNull M match);

    Collection<P> getTables();

    boolean addTable(@NotNull P table);

    boolean removeTable(@NotNull P table);

    Type getType();

    void setType(@NotNull Type type);

    boolean isSingles();

    boolean isDoubles();

    boolean isTeam();
}
