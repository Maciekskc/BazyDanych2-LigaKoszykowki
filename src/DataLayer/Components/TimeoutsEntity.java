package DataLayer.Components;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TIMEOUTS", schema = "C##APPADMIN")
public class TimeoutsEntity {
    private long id;
    private long incidentsId;
    private long teamsId;
    private IncidentsEntity incidentsByIncidentsId;
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
    @Column(name = "INCIDENTS_ID")
    public long getIncidentsId() {
        return incidentsId;
    }

    public void setIncidentsId(long incidentsId) {
        this.incidentsId = incidentsId;
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
        TimeoutsEntity that = (TimeoutsEntity) o;
        return id == that.id &&
                incidentsId == that.incidentsId &&
                teamsId == that.teamsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incidentsId, teamsId);
    }

    @ManyToOne
    @JoinColumn(name = "INCIDENTS_ID", referencedColumnName = "ID", nullable = false , insertable = false, updatable = false)
    public IncidentsEntity getIncidentsByIncidentsId() {
        return incidentsByIncidentsId;
    }

    public void setIncidentsByIncidentsId(IncidentsEntity incidentsByIncidentsId) {
        this.incidentsByIncidentsId = incidentsByIncidentsId;
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
