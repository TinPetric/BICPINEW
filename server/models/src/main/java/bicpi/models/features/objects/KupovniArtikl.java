package bicpi.models.features.objects;

public class KupovniArtikl {
    private Integer sifartikl;

    private Double cijena;
    private Integer kolicina;

    public KupovniArtikl(Integer sifartikl, Double cijena, Integer kolicina) {
        this.sifartikl = sifartikl;
        this.cijena = cijena;
        this.kolicina = kolicina;
    }

    public Integer getSifartikl() {
        return sifartikl;
    }

    public Double getCijena() {
        return cijena;
    }

    public Integer getKolicina() {
        return kolicina;
    }

}
