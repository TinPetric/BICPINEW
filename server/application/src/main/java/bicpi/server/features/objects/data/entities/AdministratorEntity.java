package bicpi.server.features.objects.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "administrator", schema = "public", catalog = "BICPI")
public class AdministratorEntity{
    @Id
    private Integer idkorisnik;
    private String radnomjesto;
    private KorisnikEntity korisnikByIdKorisnik;

    @Id
    @Column(name = "idkorisnik")
    public Integer getIdkorisnik(){
        return idkorisnik;
    }

    public void setIdkorisnik(Integer idkorisnik){
        this.idkorisnik = idkorisnik;
    }

    @Basic
    @Column(name = "radnomjesto")
    public String getRadnomjesto(){
        return radnomjesto;
    }

    public void setRadnomjesto(String radnomjesto){
        this.radnomjesto = radnomjesto;
    }

    @OneToOne
    @JoinColumn(name = "idkorisnik", referencedColumnName = "idkorisnik", insertable = false, updatable = false)
    public KorisnikEntity getKorisnikByIdKorisnik() {
        return korisnikByIdKorisnik;
    }

    public void setKorisnikByIdKorisnik(KorisnikEntity korisnikByIdKorisnik) {
        this.korisnikByIdKorisnik = korisnikByIdKorisnik;
    }
}
