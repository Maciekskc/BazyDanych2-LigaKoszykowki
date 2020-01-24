package DataLayer.Components;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "MATCHES", schema = "C##APPADMIN")
public class MatchesEntity {
    @GeneratedValue
    private long id;
    private Time date;
    private Long refereesId;
    private Long refereesId1;
    private Long teamsId1;
    private Long teamsId;
    private Collection<IncidentsEntity> incidentsById;
    private RefereesEntity refereesByRefereesId;
    private RefereesEntity refereesByRefereesId1;
    private TeamsEntity teamsByTeamsId1;
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
    @Column(name = "date")
    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    @Basic
    @Column(name = "REFEREES_ID")
    public Long getRefereesId() {
        return refereesId;
    }

    public void setRefereesId(Long refereesId) {
        this.refereesId = refereesId;
    }

    @Basic
    @Column(name = "REFEREES_ID1")
    public Long getRefereesId1() {
        return refereesId1;
    }

    public void setRefereesId1(Long refereesId1) {
        this.refereesId1 = refereesId1;
    }

    @Basic
    @Column(name = "TEAMS_ID1")
    public Long getTeamsId1() {
        return teamsId1;
    }

    public void setTeamsId1(Long teamsId1) {
        this.teamsId1 = teamsId1;
    }

    @Basic
    @Column(name = "TEAMS_ID")
    public Long getTeamsId() {
        return teamsId;
    }

    public void setTeamsId(Long teamsId) {
        this.teamsId = teamsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchesEntity that = (MatchesEntity) o;
        return id == that.id &&
                Objects.equals(date, that.date) &&
                Objects.equals(refereesId, that.refereesId) &&
                Objects.equals(refereesId1, that.refereesId1) &&
                Objects.equals(teamsId1, that.teamsId1) &&
                Objects.equals(teamsId, that.teamsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, refereesId, refereesId1, teamsId1, teamsId);
    }

    @OneToMany(mappedBy = "matchesByMatchesId")
    public Collection<IncidentsEntity> getIncidentsById() {
        return incidentsById;
    }

    public void setIncidentsById(Collection<IncidentsEntity> incidentsById) {
        this.incidentsById = incidentsById;
    }

    @ManyToOne
    @JoinColumn(name = "REFEREES_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    public RefereesEntity getRefereesByRefereesId() {
        return refereesByRefereesId;
    }

    public void setRefereesByRefereesId(RefereesEntity refereesByRefereesId) {
        this.refereesByRefereesId = refereesByRefereesId;
    }

    @ManyToOne
    @JoinColumn(name = "REFEREES_ID1", referencedColumnName = "ID", insertable = false, updatable = false)
    public RefereesEntity getRefereesByRefereesId1() {
        return refereesByRefereesId1;
    }

    public void setRefereesByRefereesId1(RefereesEntity refereesByRefereesId1) {
        this.refereesByRefereesId1 = refereesByRefereesId1;
    }

    @ManyToOne
    @JoinColumn(name = "TEAMS_ID1", referencedColumnName = "ID", insertable = false, updatable = false)
    public TeamsEntity getTeamsByTeamsId1() {
        return teamsByTeamsId1;
    }

    public void setTeamsByTeamsId1(TeamsEntity teamsByTeamsId1) {
        this.teamsByTeamsId1 = teamsByTeamsId1;
    }

    @ManyToOne
    @JoinColumn(name = "TEAMS_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    public TeamsEntity getTeamsByTeamsId() {
        return teamsByTeamsId;
    }

    public void setTeamsByTeamsId(TeamsEntity teamsByTeamsId) {
        this.teamsByTeamsId = teamsByTeamsId;
    }
}
