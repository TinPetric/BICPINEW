package bicpi.server.features.objects.data.dao;

import bicpi.models.features.objects.KupovniArtikl;
import bicpi.server.features.objects.data.entities.KupacEntity;
import bicpi.server.features.objects.data.entities.KupovniArtiklEntity;
import bicpi.server.features.objects.data.exceptions.KupacNotFoundException;
import bicpi.server.features.objects.data.exceptions.KupovniArtiklNotFoundException;

import java.util.List;

public interface KupovniArtiklDao {

    List<KupovniArtiklEntity> getKupovniArtikl() throws KupovniArtiklNotFoundException;

}