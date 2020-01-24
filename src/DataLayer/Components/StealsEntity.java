package DataLayer.Components;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "STEALS", schema = "C##APPADMIN")
public class StealsEntity {
    private long id;
    private long turnoversId;
    private Byte playersId;
    private TurnoversEntity turnoversByTurnoversId;
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
    @Column(name = "TURNOVERS_ID")
    public long getTurnoversId() {
        return turnoversId;
    }

    public void setTurnoversId(long turnoversId) {
        this.turnoversId = turnoversId;
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
        StealsEntity that = (StealsEntity) o;
        return id == that.id &&
                turnoversId == that.turnoversId &&
                Objects.equals(playersId, that.playersId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, turnoversId, playersId);
    }

    @ManyToOne
    @JoinColumn(name = "TURNOVERS_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public TurnoversEntity getTurnoversByTurnoversId() {
        return turnoversByTurnoversId;
    }

    public void setTurnoversByTurnoversId(TurnoversEntity turnoversByTurnoversId) {
        this.turnoversByTurnoversId = turnoversByTurnoversId;
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
