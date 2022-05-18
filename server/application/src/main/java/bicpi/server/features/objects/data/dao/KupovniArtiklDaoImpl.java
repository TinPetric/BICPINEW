package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.KupacEntity;
import bicpi.server.features.objects.data.entities.KupovniArtiklEntity;
import bicpi.server.features.objects.data.exceptions.KupacNotFoundException;
import bicpi.server.features.objects.data.exceptions.KupovniArtiklNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class KupovniArtiklDaoImpl implements KupovniArtiklDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<KupovniArtiklEntity> getKupovniArtikl() throws KupovniArtiklNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM kupovniartikl c");
        List<KupovniArtiklEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new KupovniArtiklNotFoundException();
        }
        return result;
    }
}