package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Grupa;
import bicpi.models.features.objects.Korisnik;
import bicpi.server.features.objects.exceptions.NoResultException;
import java.util.List;

public interface KorisnikBean {
    List<Korisnik> getKorisnik() throws NoResultException;
}