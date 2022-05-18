package bicpi.server.features.objects.business;


import bicpi.models.features.objects.Kupac;
import bicpi.models.features.objects.KupovniArtikl;
import bicpi.server.features.objects.data.dao.KupacDao;
import bicpi.server.features.objects.data.dao.KupovniArtiklDao;
import bicpi.server.features.objects.data.entities.KupacEntity;
import bicpi.server.features.objects.data.entities.KupovniArtiklEntity;
import bicpi.server.features.objects.data.exceptions.KupacNotFoundException;
import bicpi.server.features.objects.data.exceptions.KupovniArtiklNotFoundException;
import bicpi.server.features.objects.data.transformers.KupacTransformer;
import bicpi.server.features.objects.data.transformers.KupovniArtiklTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class KupovniArtiklBeanImpl implements KupovniArtiklBean {

    private final KupovniArtiklDao dao;
    private KupovniArtiklTransformer transformer;

    // Better for testing
    @Autowired
    public KupovniArtiklBeanImpl(KupovniArtiklDao dao) {
        this.dao = dao;
        this.transformer = new KupovniArtiklTransformer();
    }

    @Override
    public List<KupovniArtikl> getKupovniArtikl() throws NoResultException {
        List<KupovniArtikl> kupovniArtikl = new LinkedList<KupovniArtikl>();
        try {
            List<KupovniArtiklEntity> entities = dao.getKupovniArtikl();
            for(KupovniArtiklEntity entity : entities) {
                kupovniArtikl.add(transformer.getModelFrom(entity));
            }
        } catch ( KupovniArtiklNotFoundException e) {
            throw new NoResultException();
        }
        return kupovniArtikl;
    }
}
