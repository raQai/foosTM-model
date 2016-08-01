package de.kongfoos.foostm.model.registration;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.discipline.Discipline;
import de.kongfoos.foostm.model.match.Match;
import de.kongfoos.foostm.model.player.Player;
import de.kongfoos.foostm.model.table.Table;
import de.kongfoos.foostm.model.team.Team;

public class Registration<T extends Team<? extends Player>, D extends Discipline<T, ? extends Match<T>, ? extends Table<? extends Match<T>>>>
		implements IRegistration<T, D> {

	private long id;
	private T team;
	private List<D> disciplines;
	private RegistrationStatus status;

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public void setDisciplines(@NotNull Collection<D> disciplines) {
		getDisciplines().forEach(this::removeDiscipline);
		disciplines.forEach(this::addDiscipline);
	}

	@Override
	public T getTeam() {
		return team;
	}

	@Override
	public void setTeam(@NotNull T team) {
		this.team = team;
	}

	@Override
	public List<D> getDisciplines() {
		return disciplines;
	}

	@Override
	public boolean addDiscipline(@NotNull D discipline) {
		return disciplines.add(discipline);
	}

	@Override
	public boolean removeDiscipline(@NotNull D discipline) {
		return disciplines.remove(discipline);
	}

	@Override
	public RegistrationStatus getStatus() {
		return status;
	}

	@Override
	public void setStatus(@NotNull RegistrationStatus status) {
		this.status = status;
	}
}
