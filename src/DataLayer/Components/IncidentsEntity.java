package DataLayer.Components;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "INCIDENTS", schema = "C##APPADMIN")
public class IncidentsEntity {
    private long id;
    private String time;
    private boolean quater;
    private Long matchesId;
    private Collection<FoulsEntity> foulsById;
    private MatchesEntity matchesByMatchesId;
    private Collection<ShotsEntity> shotsById;
    private Collection<SubstitutionsEntity> substitutionsById;
    private Collection<TimeoutsEntity> timeoutsById;
    private Collection<TurnoversEntity> turnoversById;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TIME")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "QUATER")
    public boolean isQuater() {
        return quater;
    }

    public void setQuater(boolean quater) {
        this.quater = quater;
    }

    @Basic
    @Column(name = "MATCHES_ID")
    public Long getMatchesId() {
        return matchesId;
    }

    public void setMatchesId(Long matchesId) {
        this.matchesId = matchesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentsEntity that = (IncidentsEntity) o;
        return id == that.id &&
                quater == that.quater &&
                Objects.equals(time, that.time) &&
                Objects.equals(matchesId, that.matchesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, quater, matchesId);
    }

    @OneToMany(mappedBy = "incidentsByIncidentsId")
    public Collection<FoulsEntity> getFoulsById() {
        return foulsById;
    }

    public void setFoulsById(Collection<FoulsEntity> foulsById) {
        this.foulsById = foulsById;
    }

    @ManyToOne
    @JoinColumn(name = "MATCHES_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    public MatchesEntity getMatchesByMatchesId() {
        return matchesByMatchesId;
    }

    public void setMatchesByMatchesId(MatchesEntity matchesByMatchesId) {
        this.matchesByMatchesId = matchesByMatchesId;
    }

    @OneToMany(mappedBy = "incidentsByIncidentsId")
    public Collection<ShotsEntity> getShotsById() {
        return shotsById;
    }

    public void setShotsById(Collection<ShotsEntity> shotsById) {
        this.shotsById = shotsById;
    }

    @OneToMany(mappedBy = "incidentsByIncidentsId")
    public Collection<SubstitutionsEntity> getSubstitutionsById() {
        return substitutionsById;
    }

    public void setSubstitutionsById(Collection<SubstitutionsEntity> substitutionsById) {
        this.substitutionsById = substitutionsById;
    }

    @OneToMany(mappedBy = "incidentsByIncidentsId")
    public Collection<TimeoutsEntity> getTimeoutsById() {
        return timeoutsById;
    }

    public void setTimeoutsById(Collection<TimeoutsEntity> timeoutsById) {
        this.timeoutsById = timeoutsById;
    }

    @OneToMany(mappedBy = "incidentsByIncidentsId")
    public Collection<TurnoversEntity> getTurnoversById() {
        return turnoversById;
    }

    public void setTurnoversById(Collection<TurnoversEntity> turnoversById) {
        this.turnoversById = turnoversById;
    }
}
