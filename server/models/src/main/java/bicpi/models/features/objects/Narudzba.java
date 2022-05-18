package bicpi.models.features.objects;

import java.util.Date;

public class Narudzba {
    private Integer idnarudzba;
    private Integer idkorisnik;
    private Date datumvrijeme;

    public Narudzba(Integer idnarudzba, Integer idkorisnik, Date datumvrijeme) {
        this.idnarudzba = idnarudzba;
        this.idkorisnik = idkorisnik;
        this.datumvrijeme = datumvrijeme;
    }

    public Integer getIdnarudzba() {
        return idnarudzba;
    }

    public Integer getIdkorisnik() {
        return idkorisnik;
    }

    public Date getDatumvrijeme() {
        return datumvrijeme;
    }

}
