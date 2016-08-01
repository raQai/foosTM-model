package de.kongfoos.foostm.model.player;

import javax.validation.constraints.NotNull;
import java.util.Calendar;

public class SimplePlayer extends APlayer {
    private String forename;
    private String surname;
    private Gender gender;
    private Calendar birthDate;
    private String itsf;
    private String dtfb;
    private String club;

    @Override
    public String getForename() {
        return forename;
    }

    @Override
    public void setForename(@NotNull String forename) {
        this.forename = forename;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(@NotNull String surname) {
        this.surname = surname;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setGender(@NotNull Gender gender) {
        this.gender = gender;
    }

    @Override
    public Calendar getBirthDate() {
        return birthDate;
    }

    @Override
    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getItsf() {
        return itsf;
    }

    @Override
    public void setItsf(String itsf) {
        this.itsf = itsf;
    }

    @Override
    public String getDtfb() {
        return dtfb;
    }

    @Override
    public void setDtfb(String dtfb) {
        this.dtfb = dtfb;
    }

    @Override
    public String getClub() {
        return club;
    }

    @Override
    public void setClub(String club) {
        this.club = club;
    }
}
