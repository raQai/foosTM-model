package de.kongfoos.foostm.model.player;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

@Entity
//@MappedSuperclass
@Table(name = "player")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Access(AccessType.PROPERTY)
public interface IPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pid")
    long getId();

    void setId(long id);

    @Column(name = "forename")
    String getForename();

    void setForename(@NotNull String forename);

    @Column(name = "surname")
    String getSurname();

    void setSurname(@NotNull String surname);

    @Transient
    String getName();

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    Gender getGender();

    void setGender(@NotNull Gender gender);

    @Transient
    boolean isMale();

    @Transient
    boolean isFemale();

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    Calendar getBirthDate();

    void setBirthDate(Calendar birthDate);

    @Transient
    boolean isSenior();

    @Transient
    boolean isJunior();

    @Column(name = "itsf")
    String getItsf();

    void setItsf(String itsf);

    @Column(name = "dtfb")
    String getDtfb();

    void setDtfb(String dtfb);

    @Column(name = "club")
    String getClub();

    void setClub(String club);

}
