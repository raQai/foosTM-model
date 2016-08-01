package de.kongfoos.foostm.model.tournament;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import de.kongfoos.foostm.model.discipline.Discipline;
import de.kongfoos.foostm.model.registration.Registration;

public class Tournament<D extends Discipline, R extends Registration>
		implements ITournament<D, R> {

	private long id;
	private List<D> disciplines;
	private List<R> registrations;

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
	public void setRegistrations(@NotNull Collection<R> registrations) {
		getRegistrations().forEach(this::removeRegistration);
		registrations.forEach(this::addRegistration);
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
	public List<R> getRegistrations() {
		return registrations;
	}

	@Override
	public boolean addRegistration(@NotNull R registration) {
		return registrations.add(registration);
	}

	@Override
	public boolean removeRegistration(@NotNull R registration) {
		return registrations.remove(registration);
	}
}
