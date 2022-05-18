package bicpi.models.features.objects;

public class Grupa {
    private Integer idgrupa;
    private String naziv;

    public Grupa(Integer idgrupa, String naziv) {
        this.idgrupa = idgrupa;
        this.naziv = naziv;
    }
    public Integer getIdgrupa() {
        return idgrupa;
    }

    public String getNaziv() {
        return naziv;
    }
}
