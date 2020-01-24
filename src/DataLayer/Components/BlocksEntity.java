package DataLayer.Components;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "BLOCKS", schema = "C##APPADMIN")
public class BlocksEntity {
    private byte id;
    private short shotsId;
    private byte playersId;
    private ShotsEntity shotsByShotsId;
    private PlayersEntity playersByPlayersId;

    @Id
    @Column(name = "ID")
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SHOTS_ID")
    public short getShotsId() {
        return shotsId;
    }

    public void setShotsId(short shotsId) {
        this.shotsId = shotsId;
    }

    @Basic
    @Column(name = "PLAYERS_ID")
    public byte getPlayersId() {
        return playersId;
    }

    public void setPlayersId(byte playersId) {
        this.playersId = playersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlocksEntity that = (BlocksEntity) o;
        return id == that.id &&
                shotsId == that.shotsId &&
                playersId == that.playersId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shotsId, playersId);
    }

    @ManyToOne
    @JoinColumn(name = "SHOTS_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public ShotsEntity getShotsByShotsId() {
        return shotsByShotsId;
    }

    public void setShotsByShotsId(ShotsEntity shotsByShotsId) {
        this.shotsByShotsId = shotsByShotsId;
    }

    @ManyToOne
    @JoinColumn(name = "PLAYERS_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public PlayersEntity getPlayersByPlayersId() {
        return playersByPlayersId;
    }

    public void setPlayersByPlayersId(PlayersEntity playersByPlayersId) {
        this.playersByPlayersId = playersByPlayersId;
    }
}
