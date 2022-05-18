package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.AdministratorEntity;
import bicpi.server.features.objects.data.entities.ArtiklEntity;
import bicpi.server.features.objects.data.exceptions.AdministratorNotFoundException;
import bicpi.server.features.objects.data.exceptions.ArtiklNotFoundException;

import java.util.List;

public interface ArtiklDao {

    List<ArtiklEntity> getArtikl() throws ArtiklNotFoundException;

}
