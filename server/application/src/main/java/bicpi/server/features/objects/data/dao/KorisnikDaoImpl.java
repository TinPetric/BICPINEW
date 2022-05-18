package bicpi.server.features.objects.data.dao;

import bicpi.models.features.objects.Korisnik;
import bicpi.server.features.objects.data.entities.GrupaEntity;
import bicpi.server.features.objects.data.entities.KorisnikEntity;
import bicpi.server.features.objects.data.exceptions.GrupaNotFoundException;
import bicpi.server.features.objects.data.exceptions.KorisnikNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class KorisnikDaoImpl implements KorisnikDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<KorisnikEntity> getKorisnik() throws KorisnikNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM korisnik c");
        List<KorisnikEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new KorisnikNotFoundException();
        }
        return result;
    }
}