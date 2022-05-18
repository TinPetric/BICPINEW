package bicpi.server.features.objects.business;


import bicpi.models.features.objects.Grupa;
import bicpi.models.features.objects.Korisnik;
import bicpi.server.features.objects.data.dao.GrupaDao;
import bicpi.server.features.objects.data.dao.KorisnikDao;
import bicpi.server.features.objects.data.entities.GrupaEntity;
import bicpi.server.features.objects.data.entities.KorisnikEntity;
import bicpi.server.features.objects.data.exceptions.GrupaNotFoundException;
import bicpi.server.features.objects.data.exceptions.KorisnikNotFoundException;
import bicpi.server.features.objects.data.transformers.GrupaTransformer;
import bicpi.server.features.objects.data.transformers.KorisnikTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class KorisnikBeanImpl implements KorisnikBean {

    private final KorisnikDao dao;
    private KorisnikTransformer transformer;

    // Better for testing
    @Autowired
    public KorisnikBeanImpl(KorisnikDao dao) {
        this.dao = dao;
        this.transformer = new KorisnikTransformer();
    }

    @Override
    public List<Korisnik> getKorisnik() throws NoResultException {
        List<Korisnik> korisnik = new LinkedList<Korisnik>();
        try {
            List<KorisnikEntity> entities = dao.getKorisnik();
            for(KorisnikEntity entity : entities) {
                korisnik.add(transformer.getModelFrom(entity));
            }
        } catch ( KorisnikNotFoundException e) {
            throw new NoResultException();
        }
        return korisnik;
    }
}
