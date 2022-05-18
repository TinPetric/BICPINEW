package bicpi.server.features.objects.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "kupac", schema = "public", catalog = "BICPI")
public class KupacEntity {
    @Id
    private Integer idkorisnik;
    private String oib;
    private String adresa;
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
    @Column(name = "oib")
    public String getOib(){
        return oib;
    }

    public void setOib(String oib){
        this.oib = oib;
    }

    @Basic
    @Column(name = "adresa")
    public String getAdresa(){
        return adresa;
    }

    public void setAdresa(String adresa){
        this.adresa = adresa;
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
