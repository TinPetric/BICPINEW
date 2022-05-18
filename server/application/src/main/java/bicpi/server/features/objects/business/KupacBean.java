package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Korisnik;
import bicpi.models.features.objects.Kupac;
import bicpi.server.features.objects.exceptions.NoResultException;
import java.util.List;

public interface KupacBean {
    List<Kupac> getKupac() throws NoResultException;
}