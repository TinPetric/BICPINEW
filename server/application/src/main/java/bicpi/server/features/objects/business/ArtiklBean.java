package bicpi.server.features.objects.business;


import bicpi.models.features.objects.Administrator;
import bicpi.models.features.objects.Artikl;
import bicpi.server.features.objects.exceptions.NoResultException;

import java.util.List;

public interface ArtiklBean {
    List<Artikl> getArtikl() throws NoResultException, bicpi.server.features.objects.exceptions.NoResultException;
}