package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Kupac;
import bicpi.models.features.objects.KupovniArtikl;
import bicpi.server.features.objects.exceptions.NoResultException;
import java.util.List;

public interface KupovniArtiklBean {
    List<KupovniArtikl> getKupovniArtikl() throws NoResultException;
}