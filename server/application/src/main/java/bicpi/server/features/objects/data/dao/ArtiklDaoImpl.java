package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.AdministratorEntity;
import bicpi.server.features.objects.data.entities.ArtiklEntity;
import bicpi.server.features.objects.data.exceptions.AdministratorNotFoundException;
import bicpi.server.features.objects.data.exceptions.ArtiklNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ArtiklDaoImpl  implements ArtiklDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<ArtiklEntity> getArtikl() throws ArtiklNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM artikl c");
        List<ArtiklEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new ArtiklNotFoundException();
        }
        return result;
    }
}