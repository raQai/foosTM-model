package de.kongfoos.foostm.model.registration;

import de.kongfoos.foostm.model.discipline.ADiscipline;
import de.kongfoos.foostm.model.team.ATeam;

public abstract class ARegistration<T extends ATeam, D extends ADiscipline> implements IRegistration<T, D> {
}
