package bicpi.server.features.objects.business;

import bicpi.models.features.objects.RentabilniArtikl;
import bicpi.models.features.objects.StavkaNarudzbe;
import bicpi.server.features.objects.exceptions.NoResultException;
import java.util.List;

public interface StavkaNarudzbeBean {
    List<StavkaNarudzbe> getStavkaNarudzbe() throws NoResultException;
}