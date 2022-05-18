package bicpi.server.features.objects.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "narudzba", schema = "public", catalog = "BICPI")
public class NarudzbaEntity {
    @Id
    private Integer idnarudzba;
    private Integer idkorisnik;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datumvrijeme;
    private KorisnikEntity korisnikByIdKorisnik;

    @Id
    @Column(name = "idnarudzba")
    public Integer getIdnarudzba() {
        return idnarudzba;
    }

    public void setIdnarudzba(Integer idnarudzba) {
        this.idnarudzba = idnarudzba;
    }

    @Basic
    @Column(name = "idkorisnik")
    public Integer getIdkorisnik(){
        return idkorisnik;
    }

    public void setIdkorisnik(Integer idkorisnik){
        this.idkorisnik = idkorisnik;
    }

    @Basic
    @Column(name = "datumvrijeme")
    public Date getDatumvrijeme(){
        return datumvrijeme;
    }

    public void setDatumvrijeme(Date datumvrijeme){
        this.datumvrijeme = datumvrijeme;
    }

    @ManyToOne
    @JoinColumn(name = "idkorisnik", referencedColumnName = "idkorisnik", nullable = false)
    public KorisnikEntity getKorisnikByIdKorisnik() {
        return korisnikByIdKorisnik;
    }

    public void setKorisnikByIdKorisnik(KorisnikEntity korisnikByIdKorisnik) {
        this.korisnikByIdKorisnik = korisnikByIdKorisnik;
    }

}
