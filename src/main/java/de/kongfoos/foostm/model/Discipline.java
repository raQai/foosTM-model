package de.kongfoos.foostm.model;

import com.google.common.collect.Lists;
import de.kongfoos.foostm.model.match.Match;
import de.kongfoos.foostm.model.table.Table;
import de.kongfoos.foostm.model.team.Type;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Deprecated
public class Discipline {
    private final List<Predicate<Team>> participationRules = Lists.newArrayList();
    private final List<Team> teams = Lists.newArrayList();
    private final List<Match> matches = Lists.newArrayList();
    private final List<Table> tables = Lists.newArrayList();
    private String name;
    private String shortName;
    private Type type;

    private Discipline(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    private void setShortName(String shortName) {
        this.shortName = shortName;
    }

    private void setParticipationRules(Collection<Predicate<Team>> rules) {
        this.participationRules.addAll(rules);
    }

    private void addParticipationRule(Predicate<Team> rule) {
        participationRules.add(rule);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Team> getTeams(Predicate<Team> filter) {
        return teams.stream().filter(filter).collect(Collectors.toList());
    }

    public boolean addTeam(Team team) {
        if (team != null && this.allowsParticipation(team)) {
            teams.add(team);
            return true;
        }
        return false;
    }

    public Type getType() {
        return type;
    }

    private void setType(Type type) {
        this.type = type;
    }

    public boolean allowsParticipation(Team team) {
        return participationRules.stream().allMatch(rule -> rule.test(team));
    }

    public boolean isSingles() {
        return this.type.equals(Type.SINGLES);
    }

    public boolean isDoubles() {
        return this.type.equals(Type.DOUBLES);
    }

    public boolean isTeam() {
        return this.type.equals(Type.TEAM);
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void addMatch(@NotNull Match match) {
        this.matches.add(match);
    }

    public List<Table> getTables() {
        return tables;
    }

    public void addTable(@NotNull Table table) {
        this.tables.add(table);
    }

    public void removeTable(@NotNull Table table) {
        this.tables.remove(table);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Discipline) {
            return this.getName().equals(((Discipline) obj).getName())
                    || this.getShortName().equals(((Discipline) obj).getShortName());
        }
        return false;
    }

    public static class Builder {
        private final String name;
        private final String shortName;
        private final Type type;
        private final List<Predicate<Team>> participationRules = Lists.newArrayList();

        public Builder(@NotNull String name, @NotNull String shortName, @NotNull Type type) {
            this.name = name;
            this.shortName = shortName;
            this.type = type;
        }

        public Builder addRule(@NotNull Predicate<Team> rule) {
            this.participationRules.add(rule);
            return this;
        }

        public Discipline build() {
            final Discipline discipline = new Discipline(name);
            discipline.setShortName(shortName);
            discipline.setType(this.type);
            discipline.addParticipationRule(t -> t.getType().equals(this.type));
            discipline.setParticipationRules(participationRules);
            return discipline;
        }
    }
}
