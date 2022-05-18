package bicpi.server.features.objects.data.transformers;

import bicpi.models.features.objects.Administrator;
import bicpi.server.features.objects.data.entities.AdministratorEntity;

public class AdministratorTransformer {

    public Administrator getModelFrom(AdministratorEntity administratorEntity) {
        return new Administrator(administratorEntity.getIdkorisnik(),administratorEntity.getRadnomjesto());
    }
}