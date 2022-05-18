package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.KupovniArtiklEntity;
import bicpi.server.features.objects.data.entities.NarudzbaEntity;
import bicpi.server.features.objects.data.exceptions.KupovniArtiklNotFoundException;
import bicpi.server.features.objects.data.exceptions.NarudzbaNotFoundException;

import java.util.List;

public interface NarudzbaDao {

    List<NarudzbaEntity> getNarudzba() throws NarudzbaNotFoundException;

}