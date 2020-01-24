package DataLayer.Components;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "SHOTS", schema = "C##APPADMIN")
public class ShotsEntity {
    private short id;
    private boolean value;
    private String hit;
    private long incidentsId;
    private Byte playersId;
    private Collection<AssistsEntity> assistsById;
    private Collection<BlocksEntity> blocksById;
    private Collection<ReboundsEntity> reboundsById;
    private IncidentsEntity incidentsByIncidentsId;
    private PlayersEntity playersByPlayersId;

    @Id
    @Column(name = "ID")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "VALUE")
    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Basic
    @Column(name = "HIT")
    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
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
        ShotsEntity that = (ShotsEntity) o;
        return id == that.id &&
                value == that.value &&
                incidentsId == that.incidentsId &&
                Objects.equals(hit, that.hit) &&
                Objects.equals(playersId, that.playersId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, hit, incidentsId, playersId);
    }

    @OneToMany(mappedBy = "shotsByShotsId")
    public Collection<AssistsEntity> getAssistsById() {
        return assistsById;
    }

    public void setAssistsById(Collection<AssistsEntity> assistsById) {
        this.assistsById = assistsById;
    }

    @OneToMany(mappedBy = "shotsByShotsId")
    public Collection<BlocksEntity> getBlocksById() {
        return blocksById;
    }

    public void setBlocksById(Collection<BlocksEntity> blocksById) {
        this.blocksById = blocksById;
    }

    @OneToMany(mappedBy = "shotsByShotsId")
    public Collection<ReboundsEntity> getReboundsById() {
        return reboundsById;
    }

    public void setReboundsById(Collection<ReboundsEntity> reboundsById) {
        this.reboundsById = reboundsById;
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
