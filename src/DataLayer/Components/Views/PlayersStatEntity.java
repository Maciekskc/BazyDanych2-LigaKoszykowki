package DataLayer.Components.Views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLAYERS_STAT", schema = "C##APPADMIN")
public class PlayersStatEntity {
    private byte id;
    private String imie;
    private String nazwisko;
    private String druzyna;
    private Long rozegraneMecze;
    private Long liczbaPkt;
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
    @Column(name = "ID")
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "druzyna")
    public String getDruzyna() {
        return druzyna;
    }

    public void setDruzyna(String druzyna) {
        this.druzyna = druzyna;
    }

    @Basic
    @Column(name = "rozegrane_mecze")
    public Long getRozegraneMecze() {
        return rozegraneMecze;
    }

    public void setRozegraneMecze(Long rozegraneMecze) {
        this.rozegraneMecze = rozegraneMecze;
    }

    @Basic
    @Column(name = "liczba_pkt")
    public Long getLiczbaPkt() {
        return liczbaPkt;
    }

    public void setLiczbaPkt(Long liczbaPkt) {
        this.liczbaPkt = liczbaPkt;
    }

    @Basic
    @Column(name = "celne_2pt")
    public Long getCelne2Pt() {
        return celne2Pt;
    }

    public void setCelne2Pt(Long celne2Pt) {
        this.celne2Pt = celne2Pt;
    }

    @Basic
    @Column(name = "oddane_2pt")
    public Long getOddane2Pt() {
        return oddane2Pt;
    }

    public void setOddane2Pt(Long oddane2Pt) {
        this.oddane2Pt = oddane2Pt;
    }

    @Basic
    @Column(name = "skutecznosc_2pt")
    public String getSkutecznosc2Pt() {
        return skutecznosc2Pt;
    }

    public void setSkutecznosc2Pt(String skutecznosc2Pt) {
        this.skutecznosc2Pt = skutecznosc2Pt;
    }

    @Basic
    @Column(name = "celne_3pt")
    public Long getCelne3Pt() {
        return celne3Pt;
    }

    public void setCelne3Pt(Long celne3Pt) {
        this.celne3Pt = celne3Pt;
    }

    @Basic
    @Column(name = "oddane_3pt")
    public Long getOddane3Pt() {
        return oddane3Pt;
    }

    public void setOddane3Pt(Long oddane3Pt) {
        this.oddane3Pt = oddane3Pt;
    }

    @Basic
    @Column(name = "skutecznosc_3pt")
    public String getSkutecznosc3Pt() {
        return skutecznosc3Pt;
    }

    public void setSkutecznosc3Pt(String skutecznosc3Pt) {
        this.skutecznosc3Pt = skutecznosc3Pt;
    }

    @Basic
    @Column(name = "celne_1pt")
    public Long getCelne1Pt() {
        return celne1Pt;
    }

    public void setCelne1Pt(Long celne1Pt) {
        this.celne1Pt = celne1Pt;
    }

    @Basic
    @Column(name = "oddane_1pt")
    public Long getOddane1Pt() {
        return oddane1Pt;
    }

    public void setOddane1Pt(Long oddane1Pt) {
        this.oddane1Pt = oddane1Pt;
    }

    @Basic
    @Column(name = "skutecznosc_1pt")
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
        PlayersStatEntity that = (PlayersStatEntity) o;
        return id == that.id &&
                Objects.equals(imie, that.imie) &&
                Objects.equals(nazwisko, that.nazwisko) &&
                Objects.equals(druzyna, that.druzyna) &&
                Objects.equals(rozegraneMecze, that.rozegraneMecze) &&
                Objects.equals(liczbaPkt, that.liczbaPkt) &&
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
        return Objects.hash(id, imie, nazwisko, druzyna, rozegraneMecze, liczbaPkt, celne2Pt, oddane2Pt, skutecznosc2Pt, celne3Pt, oddane3Pt, skutecznosc3Pt, celne1Pt, oddane1Pt, skutecznosc1Pt);
    }
}
