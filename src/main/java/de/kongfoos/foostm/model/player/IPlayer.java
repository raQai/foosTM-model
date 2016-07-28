package de.kongfoos.foostm.model.player;

import java.util.Date;

public interface IPlayer {

    String getForename();

    void setForename(String forename);

    String getSurname();

    void setSurname(String surname);

    String getName();

    Gender getGender();

    void setGender(Gender gender);

    boolean isMale();

    boolean isFemale();

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    boolean isSenior();

    boolean isJunior();

    String getItsf();

    void setItsf(String itsf);

    String getDtfb();

    void setDtfb(String dtfb);

    String getClub();

    void setClub(String club);

}
