package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Narudzba;
import bicpi.server.features.objects.data.dao.NarudzbaDao;
import bicpi.server.features.objects.data.dao.NarudzbaDao;
import bicpi.server.features.objects.data.entities.NarudzbaEntity;
import bicpi.server.features.objects.data.exceptions.NarudzbaNotFoundException;
import bicpi.server.features.objects.data.transformers.NarudzbaTransformer;
import bicpi.server.features.objects.data.transformers.NarudzbaTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class NarudzbaBeanImpl implements NarudzbaBean {

    private final NarudzbaDao dao;
    private NarudzbaTransformer transformer;

    // Better for testing
    @Autowired
    public NarudzbaBeanImpl(NarudzbaDao dao) {
        this.dao = dao;
        this.transformer = new NarudzbaTransformer();
    }

    @Override
    public List<Narudzba> getNarudzba() throws NoResultException {
        List<Narudzba> narudzba = new LinkedList<Narudzba>();
        try {
            List<NarudzbaEntity> entities = dao.getNarudzba();
            for(NarudzbaEntity entity : entities) {
                narudzba.add(transformer.getModelFrom(entity));
            }
        } catch ( NarudzbaNotFoundException e) {
            throw new NoResultException();
        }
        return narudzba;
    }
}