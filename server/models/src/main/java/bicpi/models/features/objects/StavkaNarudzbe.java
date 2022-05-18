package bicpi.models.features.objects;

import java.util.Date;

public class StavkaNarudzbe {
    private Integer idnarudzba;
    private Integer sifartikl;
    private Double jedcijena;
    private Integer kolicina;
    private Date rentoddatum;
    private Date rentdodatum;

    public StavkaNarudzbe(Integer idnarudzba, Integer sifartikl, Double jedcijena, Integer kolicina, Date rentoddatum, Date rentdodatum) {
        this.idnarudzba = idnarudzba;
        this.sifartikl = sifartikl;
        this.jedcijena = jedcijena;
        this.kolicina = kolicina;
        this.rentoddatum = rentoddatum;
        this.rentdodatum = rentdodatum;
    }

    public Integer getIdnarudzba() {
        return idnarudzba;
    }

    public Integer getSifartikl() {
        return sifartikl;
    }

    public Double getJedcijena() {
        return jedcijena;
    }

    public Integer getKolicina() {
        return kolicina;
    }

    public Date getRentoddatum() {
        return rentoddatum;
    }

    public Date getRentdodatum() {
        return rentdodatum;
    }


}
