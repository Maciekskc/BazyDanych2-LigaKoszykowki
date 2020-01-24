package DataLayer.Components.Views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MATCH_RESULTS", schema = "C##APPADMIN")
@Access(value=AccessType.PROPERTY)
public class MatchResultsEntity {
    private long id;
    private String host;
    private String guest;
    private Long hostPts;
    private Long guestPts;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HOST")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Basic
    @Column(name = "GUEST")
    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    @Basic
    @Column(name = "HOST_PTS")
    public Long getHostPts() {
        return hostPts;
    }

    public void setHostPts(Long hostPts) {
        this.hostPts = hostPts;
    }

    @Basic
    @Column(name = "GUEST_PTS")
    public Long getGuestPts() {
        return guestPts;
    }

    public void setGuestPts(Long guestPts) {
        this.guestPts = guestPts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchResultsEntity that = (MatchResultsEntity) o;
        return id == that.id &&
                Objects.equals(host, that.host) &&
                Objects.equals(guest, that.guest) &&
                Objects.equals(hostPts, that.hostPts) &&
                Objects.equals(guestPts, that.guestPts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, host, guest, hostPts, guestPts);
    }
}
