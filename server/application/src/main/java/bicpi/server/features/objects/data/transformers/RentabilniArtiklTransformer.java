package bicpi.server.features.objects.data.transformers;

import bicpi.models.features.objects.Grupa;
import bicpi.models.features.objects.RentabilniArtikl;
import bicpi.server.features.objects.data.entities.GrupaEntity;
import bicpi.server.features.objects.data.entities.RentabilniArtiklEntity;

public class RentabilniArtiklTransformer {

    public RentabilniArtikl getModelFrom(RentabilniArtiklEntity rentabilniArtiklEntity) {
        return new RentabilniArtikl(rentabilniArtiklEntity.getSifartikl(), rentabilniArtiklEntity.getCijenadan(), rentabilniArtiklEntity.getIznajmljeno());
    }
}