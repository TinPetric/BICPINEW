package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Artikl;
import bicpi.server.features.objects.data.dao.ArtiklDao;
import bicpi.server.features.objects.data.entities.ArtiklEntity;
import bicpi.server.features.objects.data.exceptions.ArtiklNotFoundException;
import bicpi.server.features.objects.data.transformers.ArtiklTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ArtiklBeanImpl implements ArtiklBean {

    private final ArtiklDao dao;
    private ArtiklTransformer transformer;

    // Better for testing
    @Autowired
    public ArtiklBeanImpl(ArtiklDao dao) {
        this.dao = dao;
        this.transformer = new ArtiklTransformer();
    }

    @Override
    public List<Artikl> getArtikl() throws NoResultException {
        List<Artikl> artikl = new LinkedList<Artikl>();
        try {
            List<ArtiklEntity> entities = dao.getArtikl();
            for(ArtiklEntity entity : entities) {
                artikl.add(transformer.getModelFrom(entity));
            }
        } catch ( ArtiklNotFoundException e) {
            throw new NoResultException();
        }
        return artikl;
    }
}
