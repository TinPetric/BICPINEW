package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Artikl;
import bicpi.models.features.objects.Grupa;
import bicpi.server.features.objects.exceptions.NoResultException;

import java.util.List;

public interface GrupaBean {
    List<Grupa> getGrupa() throws NoResultException;
}