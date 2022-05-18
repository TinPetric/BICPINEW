package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.KorisnikEntity;
import bicpi.server.features.objects.data.entities.KupacEntity;
import bicpi.server.features.objects.data.exceptions.KorisnikNotFoundException;
import bicpi.server.features.objects.data.exceptions.KupacNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class KupacDaoImpl implements KupacDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<KupacEntity> getKupac() throws KupacNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM kupac c");
        List<KupacEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new KupacNotFoundException();
        }
        return result;
    }
}