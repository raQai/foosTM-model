package de.kongfoos.foostm.model.player;

import java.util.Date;

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
import javax.persistence.Transient;

@Entity
//@MappedSuperclass
@Table(name="player")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Access(AccessType.PROPERTY)
public interface IPlayer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pid")
	long getId();
	
	void setId(long id);
	
	@Column(name="forename")
    String getForename();

    void setForename(String forename);

    @Column(name="surname")
    String getSurname();

    void setSurname(String surname);

    @Enumerated(EnumType.STRING)
    Gender getGender();

    void setGender(Gender gender);

    @Temporal(TemporalType.DATE)
    Date getBirthDate();

    void setBirthDate(Date birthDate);

    @Column(name="itsf")
    String getItsf();

    void setItsf(String itsf);

    @Column(name="dtfb")
    String getDtfb();

    void setDtfb(String dtfb);

    @Column(name="club")
    String getClub();

    void setClub(String club);

    @Transient
    String getName();

}
