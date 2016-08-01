package de.kongfoos.foostm.model.player;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

public interface IPlayer {

    long getId();

    void setId(long id);

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
