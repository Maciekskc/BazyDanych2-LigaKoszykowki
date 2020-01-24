package DataLayer.Components;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "REFEREES", schema = "C##APPADMIN")
public class RefereesEntity {
    private long id;
    private byte peopleId;
    private Collection<MatchesEntity> matchesById;
    private Collection<MatchesEntity> matchesById_0;
    private PeopleEntity peopleByPeopleId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PEOPLE_ID")
    public byte getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(byte peopleId) {
        this.peopleId = peopleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefereesEntity that = (RefereesEntity) o;
        return id == that.id &&
                peopleId == that.peopleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, peopleId);
    }

    @OneToMany(mappedBy = "refereesByRefereesId")
    public Collection<MatchesEntity> getMatchesById() {
        return matchesById;
    }

    public void setMatchesById(Collection<MatchesEntity> matchesById) {
        this.matchesById = matchesById;
    }

    @OneToMany(mappedBy = "refereesByRefereesId1")
    public Collection<MatchesEntity> getMatchesById_0() {
        return matchesById_0;
    }

    public void setMatchesById_0(Collection<MatchesEntity> matchesById_0) {
        this.matchesById_0 = matchesById_0;
    }

    @ManyToOne
    @JoinColumn(name = "PEOPLE_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public PeopleEntity getPeopleByPeopleId() {
        return peopleByPeopleId;
    }

    public void setPeopleByPeopleId(PeopleEntity peopleByPeopleId) {
        this.peopleByPeopleId = peopleByPeopleId;
    }
}
