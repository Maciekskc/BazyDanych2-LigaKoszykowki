package DataLayer.Components.Views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLAYERS_OTHER_STAT", schema = "C##APPADMIN")
@Access(value=AccessType.PROPERTY)
public class PlayersOtherStatEntity {
    private byte id;
    private String imie;
    private String nazwisko;
    private String druzyna;
    private Long srZbiorekO;
    private Long srZbiorekD;
    private Long srZbiorek;
    private Long srAsyst;
    private Long srBlokow;
    private Long srStrat;
    private Long srPrzechwytow;

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
    @Column(name = "sr_zbiorek_o")
    public Long getSrZbiorekO() {
        return srZbiorekO;
    }

    public void setSrZbiorekO(Long srZbiorekO) {
        this.srZbiorekO = srZbiorekO;
    }

    @Basic
    @Column(name = "sr_zbiorek_d")
    public Long getSrZbiorekD() {
        return srZbiorekD;
    }

    public void setSrZbiorekD(Long srZbiorekD) {
        this.srZbiorekD = srZbiorekD;
    }

    @Basic
    @Column(name = "sr_zbiorek")
    public Long getSrZbiorek() {
        return srZbiorek;
    }

    public void setSrZbiorek(Long srZbiorek) {
        this.srZbiorek = srZbiorek;
    }

    @Basic
    @Column(name = "sr_asyst")
    public Long getSrAsyst() {
        return srAsyst;
    }

    public void setSrAsyst(Long srAsyst) {
        this.srAsyst = srAsyst;
    }

    @Basic
    @Column(name = "sr_blokow")
    public Long getSrBlokow() {
        return srBlokow;
    }

    public void setSrBlokow(Long srBlokow) {
        this.srBlokow = srBlokow;
    }

    @Basic
    @Column(name = "sr_strat")
    public Long getSrStrat() {
        return srStrat;
    }

    public void setSrStrat(Long srStrat) {
        this.srStrat = srStrat;
    }

    @Basic
    @Column(name = "sr_przechwytow")
    public Long getSrPrzechwytow() {
        return srPrzechwytow;
    }

    public void setSrPrzechwytow(Long srPrzechwytow) {
        this.srPrzechwytow = srPrzechwytow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayersOtherStatEntity that = (PlayersOtherStatEntity) o;
        return id == that.id &&
                Objects.equals(imie, that.imie) &&
                Objects.equals(nazwisko, that.nazwisko) &&
                Objects.equals(druzyna, that.druzyna) &&
                Objects.equals(srZbiorekO, that.srZbiorekO) &&
                Objects.equals(srZbiorekD, that.srZbiorekD) &&
                Objects.equals(srZbiorek, that.srZbiorek) &&
                Objects.equals(srAsyst, that.srAsyst) &&
                Objects.equals(srBlokow, that.srBlokow) &&
                Objects.equals(srStrat, that.srStrat) &&
                Objects.equals(srPrzechwytow, that.srPrzechwytow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, nazwisko, druzyna, srZbiorekO, srZbiorekD, srZbiorek, srAsyst, srBlokow, srStrat, srPrzechwytow);
    }
}
