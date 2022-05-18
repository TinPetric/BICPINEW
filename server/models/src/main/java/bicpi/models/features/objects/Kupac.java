package bicpi.models.features.objects;

public class Kupac {
    private Integer idkorisnik;
    private String oib;
    private String adresa;

    public Kupac(Integer idkorisnik, String oib, String adresa) {
        this.idkorisnik = idkorisnik;
        this.oib = oib;
        this.adresa = adresa;
    }

    public Integer getIdkorisnik() {
        return idkorisnik;
    }

    public String getOib() {
        return oib;
    }

    public String getAdresa() {
        return adresa;
    }


}
