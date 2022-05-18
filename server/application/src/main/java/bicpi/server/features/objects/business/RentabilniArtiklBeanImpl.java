package bicpi.server.features.objects.business;

import bicpi.models.features.objects.RentabilniArtikl;
import bicpi.server.features.objects.data.dao.RentabilniArtiklDao;
import bicpi.server.features.objects.data.entities.RentabilniArtiklEntity;
import bicpi.server.features.objects.data.exceptions.RentabilniArtiklNotFoundException;
import bicpi.server.features.objects.data.transformers.RentabilniArtiklTransformer;
import bicpi.server.features.objects.exceptions.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class RentabilniArtiklBeanImpl implements RentabilniArtiklBean {

    private final RentabilniArtiklDao dao;
    private RentabilniArtiklTransformer transformer;

    // Better for testing
    @Autowired
    public RentabilniArtiklBeanImpl(RentabilniArtiklDao dao) {
        this.dao = dao;
        this.transformer = new RentabilniArtiklTransformer();
    }

    @Override
    public List<RentabilniArtikl> getRentabilniArtikl() throws NoResultException {
        List<RentabilniArtikl> rentabilniArtikl = new LinkedList<RentabilniArtikl>();
        try {
            List<RentabilniArtiklEntity> entities = dao.getRentabilniArtikl();
            for(RentabilniArtiklEntity entity : entities) {
                rentabilniArtikl.add(transformer.getModelFrom(entity));
            }
        } catch ( RentabilniArtiklNotFoundException e) {
            throw new NoResultException();
        }
        return rentabilniArtikl;
    }
}