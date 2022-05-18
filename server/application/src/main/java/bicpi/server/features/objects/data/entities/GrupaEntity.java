package bicpi.server.features.objects.data.entities;


import javax.persistence.*;

@Entity
@Table(name = "grupa", schema = "public", catalog = "BICPI")
public class GrupaEntity {
    @Id
    private Integer idgrupa;
    private String naziv;

    @Id
    @Column(name = "idgrupa")
    public Integer getIdgrupa() {
        return idgrupa;
    }

    public void setIdgrupa(Integer idgrupa) {
        this.idgrupa = idgrupa;
    }

    @Basic
    @Column(name = "naziv")
    public String getNaziv(){
        return naziv;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
}
