package DataLayer.Components;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "TURNOVERS", schema = "C##APPADMIN")
public class TurnoversEntity {
    private long id;
    private long incidentsId;
    private Byte playersId;
    private Collection<StealsEntity> stealsById;
    private IncidentsEntity incidentsByIncidentsId;
    private PlayersEntity playersByPlayersId;

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
    @Column(name = "PLAYERS_ID")
    public Byte getPlayersId() {
        return playersId;
    }

    public void setPlayersId(Byte playersId) {
        this.playersId = playersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TurnoversEntity that = (TurnoversEntity) o;
        return id == that.id &&
                incidentsId == that.incidentsId &&
                Objects.equals(playersId, that.playersId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incidentsId, playersId);
    }

    @OneToMany(mappedBy = "turnoversByTurnoversId")
    public Collection<StealsEntity> getStealsById() {
        return stealsById;
    }

    public void setStealsById(Collection<StealsEntity> stealsById) {
        this.stealsById = stealsById;
    }

    @ManyToOne
    @JoinColumn(name = "INCIDENTS_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public IncidentsEntity getIncidentsByIncidentsId() {
        return incidentsByIncidentsId;
    }

    public void setIncidentsByIncidentsId(IncidentsEntity incidentsByIncidentsId) {
        this.incidentsByIncidentsId = incidentsByIncidentsId;
    }

    @ManyToOne
    @JoinColumn(name = "PLAYERS_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    public PlayersEntity getPlayersByPlayersId() {
        return playersByPlayersId;
    }

    public void setPlayersByPlayersId(PlayersEntity playersByPlayersId) {
        this.playersByPlayersId = playersByPlayersId;
    }
}
