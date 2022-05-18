package bicpi.models.features.objects;

public class Korisnik {
    private Integer idkorisnik;

    private String ime;
    private String prezime;
    private String korisnickoime;
    private String lozinka;

    public Korisnik(Integer idkorisnik, String ime, String prezime, String korisnickoime, String lozinka) {
        this.idkorisnik = idkorisnik;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoime = korisnickoime;
        this.lozinka = lozinka;
    }

    public Integer getIdkorisnik() {
        return idkorisnik;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getKorisnickoime() {
        return korisnickoime;
    }

    public String getLozinka() {
        return lozinka;
    }

}
