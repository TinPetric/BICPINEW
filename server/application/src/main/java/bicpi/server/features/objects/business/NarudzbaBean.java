package bicpi.server.features.objects.business;

import bicpi.models.features.objects.KupovniArtikl;
import bicpi.models.features.objects.Narudzba;
import bicpi.server.features.objects.exceptions.NoResultException;
import java.util.List;

public interface NarudzbaBean {
    List<Narudzba> getNarudzba() throws NoResultException;
}