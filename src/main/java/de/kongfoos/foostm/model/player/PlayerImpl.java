package de.kongfoos.foostm.model.player;

public abstract class PlayerImpl implements IPlayer {

    @Override
    public String getName() {
        return getSurname().toUpperCase() + " " + getForename();
    }

    @Override
    public String toString() {
        return getName();
    }
}
