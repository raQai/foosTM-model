package de.kongfoos.foostm.model.player;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public abstract class APlayerBuilder<P extends IPlayer> {

    private String forename;
    private String surname;
    private String club = "";
    private String itsf = "";
    private String dtfb = "";
    private Calendar birthDate = Calendar.getInstance();
    private Gender gender = Gender.MALE;

    protected APlayerBuilder(String forename, String surname) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(forename), "empty forename is not allowed");
        Preconditions.checkArgument(!Strings.isNullOrEmpty(surname), "empty surname is not allowed");
        this.forename = forename;
        this.surname = surname;
    }

    public APlayerBuilder<P> club(@NotNull String club) {
        this.club = club;
        return this;
    }

    public APlayerBuilder<P> itsf(@NotNull String itsf) {
        this.itsf = itsf;
        return this;
    }

    public APlayerBuilder<P> dtfb(@NotNull String dtfb) {
        this.dtfb = dtfb;
        return this;
    }

    public APlayerBuilder<P> birthDate(@NotNull Calendar birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public APlayerBuilder<P> gender(@NotNull Gender gender) {
        this.gender = gender;
        return this;
    }

    protected abstract P getInstance();

    public P build() {
        final P instance = getInstance();
        instance.setForename(forename);
        instance.setSurname(surname);
        instance.setClub(club);
        instance.setItsf(itsf);
        instance.setDtfb(dtfb);
        instance.setBirthDate(birthDate);
        instance.setGender(gender);

        return instance;
    }
}
