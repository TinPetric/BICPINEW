package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.NarudzbaEntity;
import bicpi.server.features.objects.data.entities.RentabilniArtiklEntity;
import bicpi.server.features.objects.data.exceptions.NarudzbaNotFoundException;
import bicpi.server.features.objects.data.exceptions.RentabilniArtiklNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RentabilniArtiklDaoImpl implements RentabilniArtiklDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<RentabilniArtiklEntity> getRentabilniArtikl() throws RentabilniArtiklNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM rentabilniartikl c");
        List<RentabilniArtiklEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new RentabilniArtiklNotFoundException();
        }
        return result;
    }
}