package bicpi.server.features.objects.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "artikl", schema = "public", catalog = "BICPI")
public class ArtiklEntity {
    @Id
    private Integer sifartikl;
    private Integer idgrupa;
    private String naziv;
    private GrupaEntity grupaByIdGrupa;


    @Id
    @Column(name = "sifartikl")
    public Integer getSifartikl(){
        return sifartikl;
    }

    public void setSifartikl(Integer sifartikl){
        this.sifartikl = sifartikl;
    }

    @Basic
    @Column(name = "idgrupa")
    public Integer getIdgrupa(){
        return idgrupa;
    }

    public void setIdgrupa(Integer idgrupa){
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

    @ManyToOne
    @JoinColumn(name = "idgrupa", referencedColumnName = "idgrupa", insertable = false, updatable = false)
    public GrupaEntity getGrupaByIdGrupa() {
        return grupaByIdGrupa;
    }

    public void setGrupaByIdGrupa(GrupaEntity grupaByIdGrupa) {
        this.grupaByIdGrupa = grupaByIdGrupa;
    }


}
