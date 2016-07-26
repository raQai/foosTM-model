package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.match.IMatch;
import de.kongfoos.foostm.model.table.ITable;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;

interface IDiscipline<T extends ITeam, M extends IMatch<T, P>, P extends ITable> {

    String getName();

    String getShortName();

    List<Predicate<T>> getParticipationRules();

    void addParticipationRules(@NotNull Predicate<T> participationRules);

    boolean allowsParticipation(@NotNull T team);

    List<T> getTeams();

    boolean addTeam(@NotNull T team);

    boolean removeTeam(@NotNull T team);

    List<M> getMatches();

    boolean addMatch(@NotNull M match);

    boolean removeMatch(@NotNull M match);

    List<P> getTables();

    boolean addTable(@NotNull P table);

    boolean removeTable(@NotNull P table);

    Type getType();

    void setType(@NotNull Type type);

    boolean isSingles();

    boolean isDoubles();

    boolean isTeam();
}
