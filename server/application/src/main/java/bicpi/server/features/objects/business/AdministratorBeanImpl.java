package bicpi.server.features.objects.business;

import bicpi.models.features.objects.Administrator;
import bicpi.server.features.objects.data.dao.AdministratorDao;
import bicpi.server.features.objects.data.entities.AdministratorEntity;
import bicpi.server.features.objects.data.exceptions.AdministratorNotFoundException;
import bicpi.server.features.objects.data.transformers.AdministratorTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.server.features.food.business.CheeseBean;
import ro.ovidiuconeac.server.features.food.data.dao.CheesesDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.CheeseNotFoundException;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

import java.util.LinkedList;
import java.util.List;

@Service
public class AdministratorBeanImpl implements AdministratorBean {

    private final AdministratorDao dao;
    private AdministratorTransformer transformer;

    // Better for testing
    @Autowired
    public AdministratorBeanImpl(AdministratorDao dao) {
        this.dao = dao;
        this.transformer = new AdministratorTransformer();
    }

    @Override
    public List<Administrator> getAdministrator() throws NoResultException {
        List<Administrator> administrator = new LinkedList<Administrator>();
        try {
            List<AdministratorEntity> adminEntities = dao.getAdministrator();
            for(AdministratorEntity entity : adminEntities) {
                administrator.add(transformer.getModelFrom(entity));
            }
        } catch (AdministratorNotFoundException e) {
            throw new NoResultException();
        }
        return administrator;
    }
}
