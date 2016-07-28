package de.kongfoos.foostm.model.player;

public abstract class APlayer implements IPlayer {

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
    public String toString() {
        return getName();
    }
}
