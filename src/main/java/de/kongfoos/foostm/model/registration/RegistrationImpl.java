package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.DisciplineImpl;
import de.kongfoos.foostm.model.team.TeamImpl;

public abstract class RegistrationImpl<T extends TeamImpl, D extends DisciplineImpl> implements IRegistration<T, D> {
}
