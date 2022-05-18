package bicpi.server.features.objects.data.entities;


import javax.persistence.*;

@Entity
@Table(name = "korisnik", schema = "public", catalog = "BICPI")
public class KorisnikEntity {
    @Id
    private Integer idkorisnik;
    private String ime;
    private String prezime;
    private String korisnickoime;
    private String lozinka;

    @Id
    @Column(name = "idkorisnik")
    public Integer getIdkorisnik() {
        return idkorisnik;
    }

    public void setIdkorisnik(Integer idkorisnik){
        this.idkorisnik = idkorisnik;
    }

    @Basic
    @Column(name = "ime")
    public String getIme(){
        return ime;
    }

    public void setIme(String ime){
        this.ime = ime;
    }

    @Basic
    @Column(name = "prezime")
    public String getPrezime(){
        return prezime;
    }

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }

    @Basic
    @Column(name = "korisnickoime")
    public String getKorisnickoime(){
        return korisnickoime;
    }

    public void setKorisnickoime(String korisnickoime){
        this.korisnickoime = korisnickoime;
    }

    @Basic
    @Column(name = "lozinka")
    public String getLozinka(){
        return lozinka;
    }

    public void setLozinka(String lozinka){
        this.lozinka = lozinka;
    }
}
