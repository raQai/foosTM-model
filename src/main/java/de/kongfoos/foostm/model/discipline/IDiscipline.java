package de.kongfoos.foostm.model.discipline;

import de.kongfoos.foostm.model.match.MatchImpl;
import de.kongfoos.foostm.model.table.TableImpl;
import de.kongfoos.foostm.model.team.TeamImpl;
import de.kongfoos.foostm.model.team.Type;

import javax.validation.constraints.NotNull;
import java.util.Collection;
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

    void setPatricipationRules(@NotNull Collection<Predicate<T>> predicates);

    void clearParticipationRules();

    void addRule(@NotNull Predicate<T> predicate);

    boolean allowsParticipation(@NotNull T team);

    List<T> getTeams();

    List<T> getTeams(@NotNull Predicate<T> predicate);

    void setTeams(@NotNull Collection<T> teams);

    void clearTeams();

    boolean addTeam(@NotNull T team);

    boolean removeTeam(@NotNull T team);

    List<M> getMatches();

    void setMatches(@NotNull Collection<M> matches);

    void clearMatches();

    boolean addMatch(@NotNull M match);

    boolean removeMatch(@NotNull M match);

    List<M> getOpenMatches();

    List<P> getTables();

    void setTables(@NotNull Collection<P> tables);

    void clearTables();

    boolean addTable(@NotNull P table);

    boolean removeTable(@NotNull P table);

    List<P> getFreeTables();

}
