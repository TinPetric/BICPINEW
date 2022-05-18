package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Administrator;
import bicpi.server.features.objects.exceptions.NoResultException;
import java.util.List;

public interface AdministratorBean {
    List<Administrator> getAdministrator() throws NoResultException;
}