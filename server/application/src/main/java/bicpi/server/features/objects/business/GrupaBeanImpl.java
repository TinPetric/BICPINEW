package bicpi.server.features.objects.business;


import bicpi.models.features.objects.Artikl;
import bicpi.models.features.objects.Grupa;
import bicpi.server.features.objects.data.dao.ArtiklDao;
import bicpi.server.features.objects.data.dao.GrupaDao;
import bicpi.server.features.objects.data.entities.ArtiklEntity;
import bicpi.server.features.objects.data.entities.GrupaEntity;
import bicpi.server.features.objects.data.exceptions.ArtiklNotFoundException;
import bicpi.server.features.objects.data.exceptions.GrupaNotFoundException;
import bicpi.server.features.objects.data.transformers.ArtiklTransformer;
import bicpi.server.features.objects.data.transformers.GrupaTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class GrupaBeanImpl implements GrupaBean {

    private final GrupaDao dao;
    private GrupaTransformer transformer;

    // Better for testing
    @Autowired
    public GrupaBeanImpl(GrupaDao dao) {
        this.dao = dao;
        this.transformer = new GrupaTransformer();
    }

    @Override
    public List<Grupa> getGrupa() throws NoResultException {
        List<Grupa> grupa = new LinkedList<Grupa>();
        try {
            List<GrupaEntity> entities = dao.getGrupa();
            for(GrupaEntity entity : entities) {
                grupa.add(transformer.getModelFrom(entity));
            }
        } catch ( GrupaNotFoundException e) {
            throw new NoResultException();
        }
        return grupa;
    }
}
