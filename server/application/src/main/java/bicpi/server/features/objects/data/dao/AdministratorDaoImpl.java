package bicpi.server.features.objects.data.dao;

import bicpi.models.features.objects.Administrator;
import bicpi.server.features.objects.data.entities.AdministratorEntity;
import bicpi.server.features.objects.data.exceptions.AdministratorNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class AdministratorDaoImpl implements AdministratorDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<AdministratorEntity> getAdministrator() throws AdministratorNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM administrator c");
        List<AdministratorEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new AdministratorNotFoundException();
        }
        return result;
    }
}