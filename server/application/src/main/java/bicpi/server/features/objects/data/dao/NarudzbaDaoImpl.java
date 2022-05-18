package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.KupovniArtiklEntity;
import bicpi.server.features.objects.data.entities.NarudzbaEntity;
import bicpi.server.features.objects.data.exceptions.KupovniArtiklNotFoundException;
import bicpi.server.features.objects.data.exceptions.NarudzbaNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class NarudzbaDaoImpl implements NarudzbaDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<NarudzbaEntity> getNarudzba() throws NarudzbaNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM narudzba c");
        List<NarudzbaEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new NarudzbaNotFoundException();
        }
        return result;
    }
}