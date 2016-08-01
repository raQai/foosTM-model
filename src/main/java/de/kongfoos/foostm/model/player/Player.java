package de.kongfoos.foostm.model.player;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name = "player")
@Table(name = "player")
public class Player implements IPlayer {
    
	private static final int SENIOR_MINIMUM_AGE = 51;
	private static final int JUNIOR_MAXIMUM_AGE = 18;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
	
	@Column(name = "forename")
	private String forename;
    
	@Column(name = "surname")
	private String surname;
    
	@Enumerated(EnumType.STRING)
    @Column(name = "gender")
	private Gender gender;
    
	@Temporal(TemporalType.DATE)
    @Column(name = "birthdate")
	private Calendar birthDate;
    
	@Column(name = "itsf")
	private String itsf;
    
	@Column(name = "dtfb")
	private String dtfb;
    
	@Column(name = "club")
	private String club;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return getSurname().toUpperCase() + " " + getForename();
    }

    @Override
    public boolean isMale() {
        return getGender().equals(Gender.MALE);
    }

    @Override
    public boolean isFemale() {
        return getGender().equals(Gender.FEMALE);
    }

    @Override
    public boolean isSenior() {
        return (Calendar.getInstance().get(Calendar.YEAR) - getBirthDate().get(Calendar.YEAR)) >= SENIOR_MINIMUM_AGE;
    }

    @Override
    public boolean isJunior() {
        return (Calendar.getInstance().get(Calendar.YEAR) - getBirthDate().get(Calendar.YEAR)) <= JUNIOR_MAXIMUM_AGE;
    }

    @Override
    public String toString() {
        return getName();
    }

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
