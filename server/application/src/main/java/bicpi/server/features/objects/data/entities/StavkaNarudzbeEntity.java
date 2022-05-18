package bicpi.server.features.objects.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stavkanarudzbe", schema = "public", catalog = "BICPI")
public class StavkaNarudzbeEntity {
    @Id
    private Integer idnarudzba;
    private Integer sifartikl;
    private Double jedcijena;
    private Integer kolicina;
    @Temporal(TemporalType.DATE)
    private Date rentoddatum;
    @Temporal(TemporalType.DATE)
    private Date rentdodatum;
    private NarudzbaEntity narudzbaByIdNarudzba;
    private ArtiklEntity artiklBySifArtikl;

    @Id
    @Column(name = "idnarudzba")
    public Integer getIdnarudzba(){
        return idnarudzba;
    }

    public void setIdnarudzba(Integer idnarudzba){
        this.idnarudzba = idnarudzba;
    }

    @Basic
    @Column(name = "sifartikl")
    public Integer getSifartikl(){
        return sifartikl;
    }

    public void setSifartikl(Integer sifartikl){
        this.sifartikl = sifartikl;
    }

    @Basic
    @Column(name = "jedcijena")
    public Double getJedcijena(){
        return jedcijena;
    }

    public void setJedcijena(Double jedcijena){
        this.jedcijena = jedcijena;
    }

    @Basic
    @Column(name = "kolicina")
    public Integer getKolicina(){
        return kolicina;
    }

    public void setKolicina(Integer kolicina){
        this.kolicina = kolicina;
    }

    @Basic
    @Column(name = "rentoddatum")
    public Date getRentoddatum(){
        return rentoddatum;
    }

    public void setRentoddatum(Date rentoddatum){
        this.rentoddatum = rentoddatum;
    }

    @Basic
    @Column(name = "rentdodatum")
    public Date getRentdodatum(){
        return rentdodatum;
    }

    public void setRentdodatum(Date rentdodatum){
        this.rentdodatum = rentdodatum;
    }

    @ManyToOne
//    @JsonBackReference
    @JoinColumn(name = "idnarudzba", referencedColumnName = "idnarudzba", nullable = false)
    public NarudzbaEntity getNarudzbaByIdNarudzba() {
        return narudzbaByIdNarudzba;
    }

    public void setNarudzbaByIdNarudzba(NarudzbaEntity narudzbaByIdNarudzba) {
        this.narudzbaByIdNarudzba = narudzbaByIdNarudzba;
    }

    @OneToOne
    @JoinColumn(name = "sifartikl", referencedColumnName = "sifartikl", insertable = false, updatable = false)
    public ArtiklEntity getArtiklBySifArtikl() {
        return artiklBySifArtikl;
    }

    public void setArtiklBySifArtikl(ArtiklEntity artiklBySifArtikl) {
        this.artiklBySifArtikl = artiklBySifArtikl;
    }
}
