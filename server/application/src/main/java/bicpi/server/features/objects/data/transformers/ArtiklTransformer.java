package bicpi.server.features.objects.data.transformers;


import bicpi.models.features.objects.Artikl;
import bicpi.server.features.objects.data.entities.ArtiklEntity;

public class ArtiklTransformer {

    public Artikl getModelFrom(ArtiklEntity artiklEntity) {
        return new Artikl(artiklEntity.getSifartikl(), artiklEntity.getIdgrupa(), artiklEntity.getNaziv());
    }
}