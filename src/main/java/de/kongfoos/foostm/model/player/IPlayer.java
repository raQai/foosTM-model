package de.kongfoos.foostm.model.player;

import java.util.Date;

public interface IPlayer {

    String getForename();

    void setForename(String forename);

    String getSurname();

    void setSurname(String surname);

    Gender getGender();

    void setGender(Gender gender);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    String getItsf();

    void setItsf(String itsf);

    String getDtfb();

    void setDtfb(String dtfb);

    String getClub();

    void setClub(String club);

    String getName();

    @Override
    String toString();
}
