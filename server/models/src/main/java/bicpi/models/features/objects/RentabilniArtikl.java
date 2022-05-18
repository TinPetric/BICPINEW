package bicpi.models.features.objects;

public class RentabilniArtikl {
    private Integer sifartikl;

    private Double cijenadan;
    private Boolean iznajmljeno;

    public RentabilniArtikl(Integer sifartikl, Double cijenadan, Boolean iznajmljeno) {
        this.sifartikl = sifartikl;
        this.cijenadan = cijenadan;
        this.iznajmljeno = iznajmljeno;
    }

    public Integer getSifartikl() {
        return sifartikl;
    }

    public Double getCijenadan() {
        return cijenadan;
    }

    public Boolean getIznajmljeno() {
        return iznajmljeno;
    }

}
