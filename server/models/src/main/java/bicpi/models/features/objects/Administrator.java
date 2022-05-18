package bicpi.models.features.objects;


public class Administrator {
    private Integer idkorisnik;
    private String radnomjesto;

    public Administrator(Integer idkorisnik, String radnomjesto) {
        this.idkorisnik = idkorisnik;
        this.radnomjesto = radnomjesto;
    }

    public Integer getIdkorisnik(){
        return idkorisnik;
    }
    public String getRadnomjesto() {
        return radnomjesto;
    }
}
