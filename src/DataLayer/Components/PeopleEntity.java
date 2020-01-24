package DataLayer.Components;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "PEOPLE", schema = "C##APPADMIN")
public class PeopleEntity {
    @GeneratedValue
    private byte id;
    private String name;
    private String surname;
    private Time birthDate;
    private Collection<CoachesEntity> coachesById;
    private Collection<PlayersEntity> playersById;
    private Collection<RefereesEntity> refereesById;

    @Id
    @Column(name = "ID")
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SURNAME")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "BIRTH_DATE")
    public Time getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Time birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleEntity that = (PeopleEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthDate);
    }

    @OneToMany(mappedBy = "peopleByPeopleId")
    public Collection<CoachesEntity> getCoachesById() {
        return coachesById;
    }

    public void setCoachesById(Collection<CoachesEntity> coachesById) {
        this.coachesById = coachesById;
    }

    @OneToMany(mappedBy = "peopleByPeopleId")
    public Collection<PlayersEntity> getPlayersById() {
        return playersById;
    }

    public void setPlayersById(Collection<PlayersEntity> playersById) {
        this.playersById = playersById;
    }

    @OneToMany(mappedBy = "peopleByPeopleId")
    public Collection<RefereesEntity> getRefereesById() {
        return refereesById;
    }

    public void setRefereesById(Collection<RefereesEntity> refereesById) {
        this.refereesById = refereesById;
    }
}
