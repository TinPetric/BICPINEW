package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Narudzba;
import bicpi.models.features.objects.RentabilniArtikl;
import bicpi.server.features.objects.exceptions.NoResultException;
import java.util.List;

public interface RentabilniArtiklBean {
    List<RentabilniArtikl> getRentabilniArtikl() throws NoResultException;
}