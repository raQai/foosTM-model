package de.kongfoos.foostm.model.tournament;

import de.kongfoos.foostm.model.discipline.ADiscipline;
import de.kongfoos.foostm.model.registration.ARegistration;

public abstract class ATournament<D extends ADiscipline, R extends ARegistration> implements ITournament<D, R> {
}
