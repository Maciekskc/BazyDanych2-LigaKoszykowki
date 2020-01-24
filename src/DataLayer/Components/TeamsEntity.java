package DataLayer.Components;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "TEAMS", schema = "C##APPADMIN")
public class TeamsEntity {
    private long id;
    private String name;
    private Collection<CoachesEntity> coachesById;
    private Collection<MatchesEntity> matchesById;
    private Collection<MatchesEntity> matchesById_0;
    private Collection<PlayersEntity> playersById;
    private Collection<TimeoutsEntity> timeoutsById;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamsEntity that = (TeamsEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @OneToMany(mappedBy = "teamsByTeamsId")
    public Collection<CoachesEntity> getCoachesById() {
        return coachesById;
    }

    public void setCoachesById(Collection<CoachesEntity> coachesById) {
        this.coachesById = coachesById;
    }

    @OneToMany(mappedBy = "teamsByTeamsId1")
    public Collection<MatchesEntity> getMatchesById() {
        return matchesById;
    }

    public void setMatchesById(Collection<MatchesEntity> matchesById) {
        this.matchesById = matchesById;
    }

    @OneToMany(mappedBy = "teamsByTeamsId")
    public Collection<MatchesEntity> getMatchesById_0() {
        return matchesById_0;
    }

    public void setMatchesById_0(Collection<MatchesEntity> matchesById_0) {
        this.matchesById_0 = matchesById_0;
    }

    @OneToMany(mappedBy = "teamsByTeamsId")
    public Collection<PlayersEntity> getPlayersById() {
        return playersById;
    }

    public void setPlayersById(Collection<PlayersEntity> playersById) {
        this.playersById = playersById;
    }

    @OneToMany(mappedBy = "teamsByTeamsId")
    public Collection<TimeoutsEntity> getTimeoutsById() {
        return timeoutsById;
    }

    public void setTimeoutsById(Collection<TimeoutsEntity> timeoutsById) {
        this.timeoutsById = timeoutsById;
    }
}
