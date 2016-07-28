package de.kongfoos.foostm.model.discipline;

import de.kongfoos.foostm.model.match.AMatch;
import de.kongfoos.foostm.model.table.ATable;
import de.kongfoos.foostm.model.team.ATeam;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class ADiscipline<T extends ATeam, M extends AMatch<T>, P extends ATable<M>>
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
        return getMatches().stream().filter(AMatch::isOpen).collect(Collectors.toList());
    }

    @Override
    public List<P> getFreeTables() {
        return getTables().stream().filter(ATable::isFree).collect(Collectors.toList());
    }

    @Override
    public boolean allowsParticipation(@NotNull T team) {
        return getParticipationRules().stream().allMatch(p -> p.test(team));
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ADiscipline &&
                (getName().toLowerCase().equals(((ADiscipline) obj).getName().toLowerCase()) ||
                        getShortName().toLowerCase().equals(((ADiscipline) obj).getShortName().toLowerCase()));
    }
}
