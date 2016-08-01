package de.kongfoos.foostm.model.discipline;

import de.kongfoos.foostm.model.match.SimpleMatch;
import de.kongfoos.foostm.model.table.SimpleTable;
import de.kongfoos.foostm.model.team.SimpleTeam;
import de.kongfoos.foostm.model.team.Type;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;

public class SimpleDiscipline extends ADiscipline<SimpleTeam, SimpleMatch, SimpleTable> {
    private String name;
    private String shortName;
    private Type type;
    private List<Predicate<SimpleTeam>> rules;
    private List<SimpleTeam> teams;
    private List<SimpleMatch> matches;
    private List<SimpleTable> tables;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String s) {
        this.name = s;
    }

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public void setShortName(String s) {
        this.shortName = s;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(@NotNull Type type) {
        this.type = type;
    }

    @Override
    public List<Predicate<SimpleTeam>> getParticipationRules() {
        return rules;
    }

    @Override
    public boolean addRule(@NotNull Predicate<SimpleTeam> predicate) {
        return rules.add(predicate);
    }

    @Override
    public boolean removeRule(@NotNull Predicate<SimpleTeam> predicate) {
        return rules.remove(predicate);
    }

    @Override
    public List<SimpleTeam> getTeams() {
        return teams;
    }

    @Override
    public boolean addTeam(@NotNull SimpleTeam team) {
        return teams.add(team);
    }

    @Override
    public boolean removeTeam(@NotNull SimpleTeam team) {
        return teams.remove(team);
    }

    @Override
    public List<SimpleMatch> getMatches() {
        return matches;
    }

    @Override
    public boolean addMatch(@NotNull SimpleMatch match) {
        return matches.add(match);
    }

    @Override
    public boolean removeMatch(@NotNull SimpleMatch match) {
        return matches.remove(match);
    }

    @Override
    public List<SimpleTable> getTables() {
        return tables;
    }

    @Override
    public boolean addTable(@NotNull SimpleTable table) {
        return tables.add(table);
    }

    @Override
    public boolean removeTable(@NotNull SimpleTable table) {
        return tables.remove(table);
    }
}
