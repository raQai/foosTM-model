package de.kongfoos.foostm.model.player;

import de.kongfoos.foostm.model.ICanHasInit;

import java.util.Date;

public abstract class GenericPlayer<S, G, D> implements Comparable<GenericPlayer>, ICanHasInit {
    private S forename;
    private S surname;
    private G gender;
    private D birthDate;
    private S itsf;
    private S dtfb;
    private S club;

    private GenericPlayer(S forename, S surname) {
        this.forename = forename;
        this.surname = surname;
    }

    public S getForename() {
        return forename;
    }

    public abstract void setForename(String forename);

    public S getSurname() {
        return surname;
    }

    public abstract void setSurname(String surname);

    public G getGender() {
        return gender;
    }

    public abstract void setGender(Gender gender);

    public D getBirthDate() {
        return birthDate;
    }

    public abstract void setBirthDate(Date birthDate);

    public S getItsf() {
        return itsf;
    }

    public abstract void setItsf(String itsf);

    public S getDtfb() {
        return dtfb;
    }

    public abstract void setDtfb(String dtfb);

    public S getClub() {
        return club;
    }

    public abstract void setClub(String club);

    abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
