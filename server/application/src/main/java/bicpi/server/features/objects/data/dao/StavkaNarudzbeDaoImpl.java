package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.RentabilniArtiklEntity;
import bicpi.server.features.objects.data.entities.StavkaNarudzbeEntity;
import bicpi.server.features.objects.data.exceptions.RentabilniArtiklNotFoundException;
import bicpi.server.features.objects.data.exceptions.StavkaNarudzbeNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StavkaNarudzbeDaoImpl implements StavkaNarudzbeDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<StavkaNarudzbeEntity> getStavkaNarudzbe() throws StavkaNarudzbeNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM stavkanarudzbe c");
        List<StavkaNarudzbeEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new StavkaNarudzbeNotFoundException();
        }
        return result;
    }
}