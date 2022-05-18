package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.AdministratorEntity;
import bicpi.server.features.objects.data.exceptions.AdministratorNotFoundException;
import bicpi.models.features.objects.Administrator;

import java.util.List;

public interface AdministratorDao {

    List<AdministratorEntity> getAdministrator() throws AdministratorNotFoundException;

}
