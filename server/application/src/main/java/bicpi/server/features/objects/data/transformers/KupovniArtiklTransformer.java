package bicpi.server.features.objects.data.transformers;


import bicpi.models.features.objects.KupovniArtikl;
import bicpi.server.features.objects.data.entities.KupovniArtiklEntity;

public class KupovniArtiklTransformer {

    public KupovniArtikl getModelFrom(KupovniArtiklEntity kupovniArtiklEntity) {
        return new KupovniArtikl(kupovniArtiklEntity.getSifartikl(),kupovniArtiklEntity.getCijena(), kupovniArtiklEntity.getKolicina());
    }
}