package de.kongfoos.foostm.model.discipline;

import com.google.common.collect.Lists;
import de.kongfoos.foostm.model.team.ATeam;
import de.kongfoos.foostm.model.team.Type;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;

public abstract class ADisciplineBuilder<T extends ADiscipline> {

    private final String name;
    private final String shortName;
    private final Type type;
    private final List<Predicate<? extends ATeam>> rules = Lists.newArrayList();

    protected ADisciplineBuilder(@NotNull String name, @NotNull String shortName, @NotNull Type type) {
        this.name = name;
        this.shortName = shortName;
        this.type = type;
    }

    public ADisciplineBuilder<T> addRule(Predicate<? extends ATeam> predicate) {
        this.rules.add(predicate);
        return this;
    }

    protected abstract T getInstance();

    public T build() {
        final T discipline = getInstance();
        discipline.setName(name);
        discipline.setShortName(shortName);
        discipline.setType(type);
        rules.forEach(discipline::addRule);
        return discipline;
    }
}
