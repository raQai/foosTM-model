package de.kongfoos.foostm.model.player;

public abstract class GenericPlayer<S, G, D> implements Comparable<GenericPlayer> {
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

    public abstract void setForename(S forename);

    public S getSurname() {
        return surname;
    }

    public abstract void setSurname(S surname);

    public G getGender() {
        return gender;
    }

    public abstract void setGender(G gender);

    public D getBirthDate() {
        return birthDate;
    }

    public abstract void setBirthDate(D birthDate);

    public S getItsf() {
        return itsf;
    }

    public abstract void setItsf(S itsf);

    public S getDtfb() {
        return dtfb;
    }

    public abstract void setDtfb(S dtfb);

    public S getClub() {
        return club;
    }

    public abstract void setClub(S club);

    abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
