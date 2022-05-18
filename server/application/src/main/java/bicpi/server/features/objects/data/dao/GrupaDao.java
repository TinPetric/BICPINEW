package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.AdministratorEntity;
import bicpi.server.features.objects.data.entities.GrupaEntity;
import bicpi.server.features.objects.data.exceptions.AdministratorNotFoundException;
import bicpi.server.features.objects.data.exceptions.GrupaNotFoundException;

import java.util.List;

public interface GrupaDao {

    List<GrupaEntity> getGrupa() throws GrupaNotFoundException;

}