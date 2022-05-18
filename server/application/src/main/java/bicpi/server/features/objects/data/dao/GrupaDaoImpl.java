package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.AdministratorEntity;
import bicpi.server.features.objects.data.entities.GrupaEntity;
import bicpi.server.features.objects.data.exceptions.AdministratorNotFoundException;
import bicpi.server.features.objects.data.exceptions.GrupaNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class GrupaDaoImpl implements GrupaDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<GrupaEntity> getGrupa() throws GrupaNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM grupa c");
        List<GrupaEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new GrupaNotFoundException();
        }
        return result;
    }
}