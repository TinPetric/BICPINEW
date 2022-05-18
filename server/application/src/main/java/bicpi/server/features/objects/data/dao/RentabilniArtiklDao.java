package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.NarudzbaEntity;
import bicpi.server.features.objects.data.entities.RentabilniArtiklEntity;
import bicpi.server.features.objects.data.exceptions.NarudzbaNotFoundException;
import bicpi.server.features.objects.data.exceptions.RentabilniArtiklNotFoundException;

import java.util.List;

public interface RentabilniArtiklDao {

    List<RentabilniArtiklEntity> getRentabilniArtikl() throws RentabilniArtiklNotFoundException;

}