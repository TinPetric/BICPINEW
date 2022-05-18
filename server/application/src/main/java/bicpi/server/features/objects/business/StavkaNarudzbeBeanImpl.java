package bicpi.server.features.objects.business;

import bicpi.models.features.objects.StavkaNarudzbe;
import bicpi.server.features.objects.data.dao.StavkaNarudzbeDao;
import bicpi.server.features.objects.data.entities.StavkaNarudzbeEntity;
import bicpi.server.features.objects.data.exceptions.StavkaNarudzbeNotFoundException;
import bicpi.server.features.objects.data.transformers.StavkaNarudzbeTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StavkaNarudzbeBeanImpl implements StavkaNarudzbeBean {

    private final StavkaNarudzbeDao dao;
    private StavkaNarudzbeTransformer transformer;

    // Better for testing
    @Autowired
    public StavkaNarudzbeBeanImpl(StavkaNarudzbeDao dao) {
        this.dao = dao;
        this.transformer = new StavkaNarudzbeTransformer();
    }

    @Override
    public List<StavkaNarudzbe> getStavkaNarudzbe() throws NoResultException {
        List<StavkaNarudzbe> stavkaNarudzbe = new LinkedList<StavkaNarudzbe>();
        try {
            List<StavkaNarudzbeEntity> entities = dao.getStavkaNarudzbe();
            for(StavkaNarudzbeEntity entity : entities) {
                stavkaNarudzbe.add(transformer.getModelFrom(entity));
            }
        } catch ( StavkaNarudzbeNotFoundException e) {
            throw new NoResultException();
        }
        return stavkaNarudzbe;
    }
}