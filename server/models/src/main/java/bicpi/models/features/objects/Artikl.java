package bicpi.models.features.objects;

public class Artikl {
    private Integer sifartikl;
    private Integer idgrupa;
    private String naziv;

    public Artikl(Integer sifartikl, Integer idgrupa, String naziv) {
        this.sifartikl = sifartikl;
        this.idgrupa = idgrupa;
        this.naziv = naziv;
    }

    public Integer getSifartikl() {
        return sifartikl;
    }

    public Integer getIdgrupa() {
        return idgrupa;
    }

    public String getNaziv() {
        return naziv;
    }
}
