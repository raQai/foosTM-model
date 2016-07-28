package de.kongfoos.foostm.model.discipline;

import de.kongfoos.foostm.model.match.MatchImpl;
import de.kongfoos.foostm.model.table.TableImpl;
import de.kongfoos.foostm.model.team.TeamImpl;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class DisciplineImpl<T extends TeamImpl, M extends MatchImpl<T>, P extends TableImpl<M>>
        implements IDiscipline<T, M, P> {

    @Override
    public List<T> getTeams(Predicate<T> predicate) {
        if (predicate == null) {
            return getTeams();
        } else {
            return getTeams().stream().filter(predicate).collect(Collectors.toList());
        }
    }

    @Override
    public List<M> getOpenMatches() {
        return getMatches().stream().filter(MatchImpl::isOpen).collect(Collectors.toList());
    }

    @Override
    public List<P> getFreeTables() {
        return getTables().stream().filter(TableImpl::isFree).collect(Collectors.toList());
    }

    @Override
    public boolean allowsParticipation(@NotNull T team) {
        return getParticipationRules().stream().allMatch(p -> p.test(team));
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof DisciplineImpl &&
                (getName().toLowerCase().equals(((DisciplineImpl) obj).getName().toLowerCase()) ||
                        getShortName().toLowerCase().equals(((DisciplineImpl) obj).getShortName().toLowerCase()));
    }
}
