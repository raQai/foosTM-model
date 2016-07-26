package de.kongfoos.foostm.model;

import de.kongfoos.foostm.model.match.MatchImpl;
import de.kongfoos.foostm.model.table.ITable;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;

interface IDiscipline<T extends ITeam, M extends MatchImpl<T, P>, P extends ITable> {

    String getName();

    String getShortName();

    List<Predicate<T>> getParticipationRules();

    void addRule(@NotNull Predicate<T> predicate);

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
}
