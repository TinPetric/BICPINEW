package bicpi.server.features.objects.business;


import bicpi.models.features.objects.Korisnik;
import bicpi.models.features.objects.Kupac;
import bicpi.server.features.objects.data.dao.KorisnikDao;
import bicpi.server.features.objects.data.dao.KupacDao;
import bicpi.server.features.objects.data.entities.KorisnikEntity;
import bicpi.server.features.objects.data.entities.KupacEntity;
import bicpi.server.features.objects.data.exceptions.KorisnikNotFoundException;
import bicpi.server.features.objects.data.exceptions.KupacNotFoundException;
import bicpi.server.features.objects.data.transformers.KorisnikTransformer;
import bicpi.server.features.objects.data.transformers.KupacTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class KupacBeanImpl implements KupacBean {

    private final KupacDao dao;
    private KupacTransformer transformer;

    // Better for testing
    @Autowired
    public KupacBeanImpl(KupacDao dao) {
        this.dao = dao;
        this.transformer = new KupacTransformer();
    }

    @Override
    public List<Kupac> getKupac() throws NoResultException {
        List<Kupac> kupac = new LinkedList<Kupac>();
        try {
            List<KupacEntity> entities = dao.getKupac();
            for(KupacEntity entity : entities) {
                kupac.add(transformer.getModelFrom(entity));
            }
        } catch ( KupacNotFoundException e) {
            throw new NoResultException();
        }
        return kupac;
    }
}
