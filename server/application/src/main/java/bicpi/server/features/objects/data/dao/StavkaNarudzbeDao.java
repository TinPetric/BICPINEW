package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.RentabilniArtiklEntity;
import bicpi.server.features.objects.data.entities.StavkaNarudzbeEntity;
import bicpi.server.features.objects.data.exceptions.RentabilniArtiklNotFoundException;
import bicpi.server.features.objects.data.exceptions.StavkaNarudzbeNotFoundException;

import java.util.List;

public interface StavkaNarudzbeDao {

    List<StavkaNarudzbeEntity> getStavkaNarudzbe() throws StavkaNarudzbeNotFoundException;

}