package bicpi.server.features.objects.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "kupovniartikl",schema = "public", catalog = "BICPI")
public class KupovniArtiklEntity {

    @Id
    private Integer sifartikl;
    private Double cijena;
    private Integer kolicina;
    private ArtiklEntity artiklBySifArtikl;
    @Id
    @Column(name = "sifartikl")
    public Integer getSifartikl(){
        return sifartikl;
    }

    public void setSifartikl(Integer sifartikl){
        this.sifartikl = sifartikl;
    }

    @Basic
    @Column(name = "cijena")
    public Double getCijena(){
        return cijena;
    }

    public void setCijena(Double cijena){
        this.cijena = cijena;
    }

    @Basic
    @Column(name = "kolicina")
    public Integer getKolicina(){
        return kolicina;
    }

    public void setKolicina(Integer kolicina){
        this.kolicina = kolicina;
    }

    @OneToOne
    @JoinColumn(name = "sifartikl", referencedColumnName = "sifartikl", insertable = false, updatable = false)
    public ArtiklEntity getArtiklBySifArtikl() {
        return artiklBySifArtikl;
    }

    public void setArtiklBySifArtikl(ArtiklEntity
                                                artiklBySifArtikl) {
        this.artiklBySifArtikl = artiklBySifArtikl;
    }
}
