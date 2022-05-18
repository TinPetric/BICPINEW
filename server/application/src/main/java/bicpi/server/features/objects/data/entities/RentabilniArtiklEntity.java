package bicpi.server.features.objects.data.entities;


import javax.persistence.*;

@Entity
@Table(name = "rentabilniartikl", schema = "public", catalog = "BICPI")
public class RentabilniArtiklEntity {
    @Id
    private Integer sifartikl;
    private Double cijenadan;
    private Boolean iznajmljeno;
    private ArtiklEntity artiklBySifArtikl;

    @Id
    @Column(name = "sifartikl")
    public Integer getSifartikl() {
        return sifartikl;
    }

    public void setSifartikl(Integer sifartikl){
        this.sifartikl = sifartikl;
    }

    @Basic
    @Column(name = "cijenadan")
    public Double getCijenadan(){
        return cijenadan;
    }

    public void setCijenadan(Double cijenadan){
        this.cijenadan = cijenadan;
    }

    @Basic
    @Column(name = "iznajmljeno")
    public Boolean getIznajmljeno(){
        return iznajmljeno;
    }

    public void setIznajmljeno(Boolean iznajmljeno){
        this.iznajmljeno = iznajmljeno;
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
