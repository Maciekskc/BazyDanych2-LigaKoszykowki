package DataLayer.Components.Views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TEAMS_STAT", schema = "C##APPADMIN")
public class TeamsStatEntity {
    private long id;
    private String name;
    private Long punkty;
    private Long rozegrane;
    private Long wygrane;
    private Long przegrane;
    private Long celne2Pt;
    private Long oddane2Pt;
    private String skutecznosc2Pt;
    private Long celne3Pt;
    private Long oddane3Pt;
    private String skutecznosc3Pt;
    private Long celne1Pt;
    private Long oddane1Pt;
    private String skutecznosc1Pt;

    @Id
    @Access(value=AccessType.FIELD)
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

    @Basic
    @Column(name = "PUNKTY")
    public Long getPunkty() {
        return punkty;
    }

    public void setPunkty(Long punkty) {
        this.punkty = punkty;
    }

    @Basic
    @Column(name = "ROZEGRANE")
    public Long getRozegrane() {
        return rozegrane;
    }

    public void setRozegrane(Long rozegrane) {
        this.rozegrane = rozegrane;
    }

    @Basic
    @Column(name = "WYGRANE")
    public Long getWygrane() {
        return wygrane;
    }

    public void setWygrane(Long wygrane) {
        this.wygrane = wygrane;
    }

    @Basic
    @Column(name = "PRZEGRANE")
    public Long getPrzegrane() {
        return przegrane;
    }

    public void setPrzegrane(Long przegrane) {
        this.przegrane = przegrane;
    }

    @Basic
    @Column(name = "CELNE_2PT")
    public Long getCelne2Pt() {
        return celne2Pt;
    }

    public void setCelne2Pt(Long celne2Pt) {
        this.celne2Pt = celne2Pt;
    }

    @Basic
    @Column(name = "ODDANE_2PT")
    public Long getOddane2Pt() {
        return oddane2Pt;
    }

    public void setOddane2Pt(Long oddane2Pt) {
        this.oddane2Pt = oddane2Pt;
    }

    @Basic
    @Column(name = "SKUTECZNOSC_2PT")
    public String getSkutecznosc2Pt() {
        return skutecznosc2Pt;
    }

    public void setSkutecznosc2Pt(String skutecznosc2Pt) {
        this.skutecznosc2Pt = skutecznosc2Pt;
    }

    @Basic
    @Column(name = "CELNE_3PT")
    public Long getCelne3Pt() {
        return celne3Pt;
    }

    public void setCelne3Pt(Long celne3Pt) {
        this.celne3Pt = celne3Pt;
    }

    @Basic
    @Column(name = "ODDANE_3PT")
    public Long getOddane3Pt() {
        return oddane3Pt;
    }

    public void setOddane3Pt(Long oddane3Pt) {
        this.oddane3Pt = oddane3Pt;
    }

    @Basic
    @Column(name = "SKUTECZNOSC_3PT")
    public String getSkutecznosc3Pt() {
        return skutecznosc3Pt;
    }

    public void setSkutecznosc3Pt(String skutecznosc3Pt) {
        this.skutecznosc3Pt = skutecznosc3Pt;
    }

    @Basic
    @Column(name = "CELNE_1PT")
    public Long getCelne1Pt() {
        return celne1Pt;
    }

    public void setCelne1Pt(Long celne1Pt) {
        this.celne1Pt = celne1Pt;
    }

    @Basic
    @Column(name = "ODDANE_1PT")
    public Long getOddane1Pt() {
        return oddane1Pt;
    }

    public void setOddane1Pt(Long oddane1Pt) {
        this.oddane1Pt = oddane1Pt;
    }

    @Basic
    @Column(name = "SKUTECZNOSC_1PT")
    public String getSkutecznosc1Pt() {
        return skutecznosc1Pt;
    }

    public void setSkutecznosc1Pt(String skutecznosc1Pt) {
        this.skutecznosc1Pt = skutecznosc1Pt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamsStatEntity that = (TeamsStatEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(punkty, that.punkty) &&
                Objects.equals(rozegrane, that.rozegrane) &&
                Objects.equals(wygrane, that.wygrane) &&
                Objects.equals(przegrane, that.przegrane) &&
                Objects.equals(celne2Pt, that.celne2Pt) &&
                Objects.equals(oddane2Pt, that.oddane2Pt) &&
                Objects.equals(skutecznosc2Pt, that.skutecznosc2Pt) &&
                Objects.equals(celne3Pt, that.celne3Pt) &&
                Objects.equals(oddane3Pt, that.oddane3Pt) &&
                Objects.equals(skutecznosc3Pt, that.skutecznosc3Pt) &&
                Objects.equals(celne1Pt, that.celne1Pt) &&
                Objects.equals(oddane1Pt, that.oddane1Pt) &&
                Objects.equals(skutecznosc1Pt, that.skutecznosc1Pt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, punkty, rozegrane, wygrane, przegrane, celne2Pt, oddane2Pt, skutecznosc2Pt, celne3Pt, oddane3Pt, skutecznosc3Pt, celne1Pt, oddane1Pt, skutecznosc1Pt);
    }
}
