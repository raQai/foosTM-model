package de.kongfoos.foostm.model.player;

import javax.validation.constraints.NotNull;
import java.util.Calendar;

public interface IPlayer {

    String getForename();

    void setForename(@NotNull String forename);

    String getSurname();

    void setSurname(@NotNull String surname);

    String getName();

    Gender getGender();

    void setGender(@NotNull Gender gender);

    boolean isMale();

    boolean isFemale();

    Calendar getBirthDate();

    void setBirthDate(Calendar birthDate);

    boolean isSenior();

    boolean isJunior();

    String getItsf();

    void setItsf(String itsf);

    String getDtfb();

    void setDtfb(String dtfb);

    String getClub();

    void setClub(String club);

}
