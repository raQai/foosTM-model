package de.kongfoos.foostm.model.discipline;

import de.kongfoos.foostm.model.match.MatchImpl;
import de.kongfoos.foostm.model.table.TableImpl;
import de.kongfoos.foostm.model.team.TeamImpl;
import de.kongfoos.foostm.model.team.Type;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;

interface IDiscipline<T extends TeamImpl, M extends MatchImpl<T>, P extends TableImpl<M>> {

    String getName();

    void setName(String s);

    String getShortName();

    void setShortName(String s);

    Type getType();

    void setType(@NotNull Type type);

    List<Predicate<T>> getParticipationRules();

    void addRule(@NotNull Predicate<T> predicate);

    List<T> getTeams();

    List<T> getTeams(Predicate<T> predicate);

    boolean addTeam(@NotNull T team);

    boolean removeTeam(@NotNull T team);

    List<M> getMatches();

    boolean addMatch(@NotNull M match);

    boolean removeMatch(@NotNull M match);

    List<M> getOpenMatches();

    List<P> getTables();

    boolean addTable(@NotNull P table);

    boolean removeTable(@NotNull P table);

    List<P> getFreeTables();

    boolean allowsParticipation(@NotNull T team);

}
