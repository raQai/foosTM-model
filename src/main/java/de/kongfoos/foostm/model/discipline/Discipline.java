package de.kongfoos.foostm.model.discipline;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.match.Match;
import de.kongfoos.foostm.model.player.Player;
import de.kongfoos.foostm.model.table.Table;
import de.kongfoos.foostm.model.team.Team;
import de.kongfoos.foostm.model.team.Type;

public class Discipline<T extends Team<? extends Player>, M extends Match<T>, P extends Table<M>>
		implements IDiscipline<T, M, P> {

	private long id;
	private String name;
	private String shortName;
	private Type type;
	private List<Predicate<T>> rules;
	private List<T> teams;
	private List<M> matches;
	private List<P> tables;

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public void setPatricipationRules(
			@NotNull Collection<Predicate<T>> predicates) {
		getParticipationRules().forEach(this::removeRule);
		predicates.forEach(this::addRule);
	}

	@Override
	public boolean allowsParticipation(@NotNull T team) {
		return getParticipationRules().stream().allMatch(p -> p.test(team));
	}

	@Override
	public void setTeams(@NotNull Collection<T> teams) {
		getTeams().forEach(this::removeTeam);
		teams.forEach(this::addTeam);
	}

	@Override
	public List<T> getTeams(@NotNull Predicate<T> predicate) {
		return getTeams().stream().filter(predicate)
				.collect(Collectors.toList());
	}

	@Override
	public void setMatches(@NotNull Collection<M> matches) {
		getMatches().forEach(this::removeMatch);
		matches.forEach(this::addMatch);
	}

	@Override
	public List<M> getOpenMatches() {
		return getMatches().stream().filter(Match::isOpen)
				.collect(Collectors.toList());
	}

	@Override
	public void setTables(@NotNull Collection<P> tables) {
		getTables().forEach(this::removeTable);
		tables.forEach(this::addTable);
	}

	@Override
	public List<P> getFreeTables() {
		return getTables().stream().filter(Table::isFree)
				.collect(Collectors.toList());
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof IDiscipline
				&& (getName().toLowerCase().equals(
						((IDiscipline) obj).getName().toLowerCase()) || getShortName()
						.toLowerCase().equals(
								((IDiscipline) obj).getShortName()
										.toLowerCase()));
	}

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
	public List<Predicate<T>> getParticipationRules() {
		return rules;
	}

	@Override
	public boolean addRule(@NotNull Predicate<T> predicate) {
		return rules.add(predicate);
	}

	@Override
	public boolean removeRule(@NotNull Predicate<T> predicate) {
		return rules.remove(predicate);
	}

	@Override
	public List<T> getTeams() {
		return teams;
	}

	@Override
	public boolean addTeam(@NotNull T team) {
		return teams.add(team);
	}

	@Override
	public boolean removeTeam(@NotNull T team) {
		return teams.remove(team);
	}

	@Override
	public List<M> getMatches() {
		return matches;
	}

	@Override
	public boolean addMatch(@NotNull M match) {
		return matches.add(match);
	}

	@Override
	public boolean removeMatch(@NotNull M match) {
		return matches.remove(match);
	}

	@Override
	public List<P> getTables() {
		return tables;
	}

	@Override
	public boolean addTable(@NotNull P table) {
		return tables.add(table);
	}

	@Override
	public boolean removeTable(@NotNull P table) {
		return tables.remove(table);
	}
}
