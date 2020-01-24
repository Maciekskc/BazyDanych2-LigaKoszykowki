package DataLayer.Components;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FOULS", schema = "C##APPADMIN")
public class FoulsEntity {
    private long id;
    private long incidentsId;
    private Byte playersId;
    private Byte playersId1;
    private IncidentsEntity incidentsByIncidentsId;
    private PlayersEntity playersByPlayersId;
    private PlayersEntity playersByPlayersId1;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "INCIDENTS_ID", insertable = false, updatable = false)
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

    @Basic
    @Column(name = "PLAYERS_ID1")
    public Byte getPlayersId1() {
        return playersId1;
    }

    public void setPlayersId1(Byte playersId1) {
        this.playersId1 = playersId1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoulsEntity that = (FoulsEntity) o;
        return id == that.id &&
                incidentsId == that.incidentsId &&
                Objects.equals(playersId, that.playersId) &&
                Objects.equals(playersId1, that.playersId1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incidentsId, playersId, playersId1);
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

    @ManyToOne
    @JoinColumn(name = "PLAYERS_ID1", referencedColumnName = "ID", insertable = false, updatable = false)
    public PlayersEntity getPlayersByPlayersId1() {
        return playersByPlayersId1;
    }

    public void setPlayersByPlayersId1(PlayersEntity playersByPlayersId1) {
        this.playersByPlayersId1 = playersByPlayersId1;
    }
}
