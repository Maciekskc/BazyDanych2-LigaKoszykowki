package DataLayer.Components;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "COACHES", schema = "C##APPADMIN")
public class CoachesEntity {
    private long id;
    private long peopleId;
    private long teamsId;
    private PeopleEntity peopleByPeopleId;
    private TeamsEntity teamsByTeamsId;

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
    public long getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(long peopleId) {
        this.peopleId = peopleId;
    }

    @Basic
    @Column(name = "TEAMS_ID")
    public long getTeamsId() {
        return teamsId;
    }

    public void setTeamsId(long teamsId) {
        this.teamsId = teamsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoachesEntity that = (CoachesEntity) o;
        return id == that.id &&
                peopleId == that.peopleId &&
                teamsId == that.teamsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, peopleId, teamsId);
    }

    @ManyToOne
    @JoinColumn(name = "PEOPLE_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public PeopleEntity getPeopleByPeopleId() {
        return peopleByPeopleId;
    }

    public void setPeopleByPeopleId(PeopleEntity peopleByPeopleId) {
        this.peopleByPeopleId = peopleByPeopleId;
    }

    @ManyToOne
    @JoinColumn(name = "TEAMS_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public TeamsEntity getTeamsByTeamsId() {
        return teamsByTeamsId;
    }

    public void setTeamsByTeamsId(TeamsEntity teamsByTeamsId) {
        this.teamsByTeamsId = teamsByTeamsId;
    }
}
