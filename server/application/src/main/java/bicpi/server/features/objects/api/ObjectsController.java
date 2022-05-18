package bicpi.server.features.objects.api;

import bicpi.models.features.objects.*;
import bicpi.server.features.objects.business.*;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
public class ObjectsController {

    private final AdministratorBean administratorBean;
    private final ArtiklBean artiklBean;
    private final GrupaBean grupaBean;
    private final KorisnikBean korisnikBean;
    private final KupacBean kupacBean;
    private final KupovniArtiklBean kupovniArtiklBean;
    private final NarudzbaBean narudzbaBean;
    private final RentabilniArtiklBean rentabilniArtiklBean;
    private final StavkaNarudzbeBean stavkaNarudzbeBean;

    @Autowired
    public ObjectsController(AdministratorBean administratorBean,ArtiklBean artiklBean,GrupaBean grupaBean,KorisnikBean korisnikBean,KupacBean kupacBean,KupovniArtiklBean kupovniArtiklBean,NarudzbaBean narudzbaBean,RentabilniArtiklBean rentabilniArtiklBean,StavkaNarudzbeBean stavkaNarudzbeBean) {
        this.administratorBean = administratorBean;
        this.artiklBean = artiklBean;
        this.grupaBean = grupaBean;
        this.korisnikBean = korisnikBean;
        this.kupacBean = kupacBean;
        this.kupovniArtiklBean = kupovniArtiklBean;
        this.narudzbaBean = narudzbaBean;
        this.rentabilniArtiklBean = rentabilniArtiklBean;
        this.stavkaNarudzbeBean = stavkaNarudzbeBean;

    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/administrator")
    public List<Administrator> getAdministrator() throws NoResultException {
        return administratorBean.getAdministrator();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/artikl")
    public List<Artikl> getArtikl() throws NoResultException{
        return artiklBean.getArtikl();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/grupa")
    public List<Grupa> getGrupa() throws NoResultException{
        return grupaBean.getGrupa();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/korisnik")
    public List<Korisnik> getKorisnik() throws NoResultException{
        return korisnikBean.getKorisnik();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/kupac")
    public List<Kupac> getKupac() throws NoResultException{
        return kupacBean.getKupac();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/kupovniartikl")
    public List<KupovniArtikl> getKupovniArtikl() throws NoResultException{
        return kupovniArtiklBean.getKupovniArtikl();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/narudzba")
    public List<Narudzba> getNarudzba() throws NoResultException{
        return narudzbaBean.getNarudzba();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/rentabilniartikl")
    public List<RentabilniArtikl> getRentabilniArtikl() throws NoResultException{
        return rentabilniArtiklBean.getRentabilniArtikl();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/objects/stavkanarudzbe")
    public List<StavkaNarudzbe> getStavkaNarudzbe() throws NoResultException{
        return stavkaNarudzbeBean.getStavkaNarudzbe();
    }
}