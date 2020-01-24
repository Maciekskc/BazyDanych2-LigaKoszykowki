package DataLayer.Components;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "PLAYERS", schema = "C##APPADMIN")
public class PlayersEntity {
    private byte id;
    private long jerseyNr;
    private byte peopleId;
    private long teamsId;
    private Collection<AssistsEntity> assistsById;
    private Collection<BlocksEntity> blocksById;
    private Collection<FoulsEntity> foulsById;
    private Collection<FoulsEntity> foulsById_0;
    private PeopleEntity peopleByPeopleId;
    private TeamsEntity teamsByTeamsId;
    private Collection<ReboundsEntity> reboundsById;
    private Collection<ShotsEntity> shotsById;
    private Collection<StealsEntity> stealsById;
    private Collection<SubstitutionsEntity> substitutionsById;
    private Collection<SubstitutionsEntity> substitutionsById_0;
    private Collection<TurnoversEntity> turnoversById;

    @Id
    @Column(name = "ID")
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "JERSEY_NR")
    public long getJerseyNr() {
        return jerseyNr;
    }

    public void setJerseyNr(long jerseyNr) {
        this.jerseyNr = jerseyNr;
    }

    @Basic
    @Column(name = "PEOPLE_ID")
    public byte getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(byte peopleId) {
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
        PlayersEntity that = (PlayersEntity) o;
        return id == that.id &&
                jerseyNr == that.jerseyNr &&
                peopleId == that.peopleId &&
                teamsId == that.teamsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jerseyNr, peopleId, teamsId);
    }

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<AssistsEntity> getAssistsById() {
        return assistsById;
    }

    public void setAssistsById(Collection<AssistsEntity> assistsById) {
        this.assistsById = assistsById;
    }

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<BlocksEntity> getBlocksById() {
        return blocksById;
    }

    public void setBlocksById(Collection<BlocksEntity> blocksById) {
        this.blocksById = blocksById;
    }

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<FoulsEntity> getFoulsById() {
        return foulsById;
    }

    public void setFoulsById(Collection<FoulsEntity> foulsById) {
        this.foulsById = foulsById;
    }

    @OneToMany(mappedBy = "playersByPlayersId1")
    public Collection<FoulsEntity> getFoulsById_0() {
        return foulsById_0;
    }

    public void setFoulsById_0(Collection<FoulsEntity> foulsById_0) {
        this.foulsById_0 = foulsById_0;
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

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<ReboundsEntity> getReboundsById() {
        return reboundsById;
    }

    public void setReboundsById(Collection<ReboundsEntity> reboundsById) {
        this.reboundsById = reboundsById;
    }

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<ShotsEntity> getShotsById() {
        return shotsById;
    }

    public void setShotsById(Collection<ShotsEntity> shotsById) {
        this.shotsById = shotsById;
    }

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<StealsEntity> getStealsById() {
        return stealsById;
    }

    public void setStealsById(Collection<StealsEntity> stealsById) {
        this.stealsById = stealsById;
    }

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<SubstitutionsEntity> getSubstitutionsById() {
        return substitutionsById;
    }

    public void setSubstitutionsById(Collection<SubstitutionsEntity> substitutionsById) {
        this.substitutionsById = substitutionsById;
    }

    @OneToMany(mappedBy = "playersByPlayersId1")
    public Collection<SubstitutionsEntity> getSubstitutionsById_0() {
        return substitutionsById_0;
    }

    public void setSubstitutionsById_0(Collection<SubstitutionsEntity> substitutionsById_0) {
        this.substitutionsById_0 = substitutionsById_0;
    }

    @OneToMany(mappedBy = "playersByPlayersId")
    public Collection<TurnoversEntity> getTurnoversById() {
        return turnoversById;
    }

    public void setTurnoversById(Collection<TurnoversEntity> turnoversById) {
        this.turnoversById = turnoversById;
    }
}
