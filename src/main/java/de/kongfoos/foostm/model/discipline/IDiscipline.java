package de.kongfoos.foostm.model.discipline;

import de.kongfoos.foostm.model.match.IMatch;
import de.kongfoos.foostm.model.table.ITable;
import de.kongfoos.foostm.model.team.ITeam;
import de.kongfoos.foostm.model.team.Type;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public interface IDiscipline<T extends ITeam, M extends IMatch<T>, P extends ITable<M>> {

    String getName();

    void setName(String s);

    String getShortName();

    void setShortName(String s);

    Type getType();

    void setType(@NotNull Type type);

    List<Predicate<T>> getParticipationRules();

    void setPatricipationRules(@NotNull Collection<Predicate<T>> predicates);

    void addRule(@NotNull Predicate<T> predicate);

    boolean allowsParticipation(@NotNull T team);

    List<T> getTeams();

    void setTeams(@NotNull Collection<T> teams);

    List<T> getTeams(@NotNull Predicate<T> predicate);

    boolean addTeam(@NotNull T team);

    boolean removeTeam(@NotNull T team);

    List<M> getMatches();

    void setMatches(@NotNull Collection<M> matches);

    boolean addMatch(@NotNull M match);

    boolean removeMatch(@NotNull M match);

    List<M> getOpenMatches();

    List<P> getTables();

    void setTables(@NotNull Collection<P> tables);

    boolean addTable(@NotNull P table);

    boolean removeTable(@NotNull P table);

    List<P> getFreeTables();

}
