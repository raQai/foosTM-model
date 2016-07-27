package de.kongfoos.foostm.model.tournament;

import de.kongfoos.foostm.model.discipline.DisciplineImpl;
import de.kongfoos.foostm.model.registration.RegistrationImpl;

/**
 * Created by patrick on 27/07/16.
 */
public abstract class TournamentImpl<D extends DisciplineImpl, R extends RegistrationImpl> implements ITournament<D, R> {
}
