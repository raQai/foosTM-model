package de.kongfoos.foostm.model.player;

import java.util.Calendar;

public abstract class APlayer implements IPlayer {

    private static final int SENIOR_MINIMUM_AGE = 51;
    private static final int JUNIOR_MAXIMUM_AGE = 18;

    private long id;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return getSurname().toUpperCase() + " " + getForename();
    }

    @Override
    public boolean isMale() {
        return getGender().equals(Gender.MALE);
    }

    @Override
    public boolean isFemale() {
        return getGender().equals(Gender.FEMALE);
    }

    @Override
    public boolean isSenior() {
        return (Calendar.getInstance().get(Calendar.YEAR) - getBirthDate().get(Calendar.YEAR)) >= SENIOR_MINIMUM_AGE;
    }

    @Override
    public boolean isJunior() {
        return (Calendar.getInstance().get(Calendar.YEAR) - getBirthDate().get(Calendar.YEAR)) <= JUNIOR_MAXIMUM_AGE;
    }

    @Override
    public String toString() {
        return getName();
    }
}
