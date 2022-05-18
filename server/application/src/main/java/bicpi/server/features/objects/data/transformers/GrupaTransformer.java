package bicpi.server.features.objects.data.transformers;


import bicpi.models.features.objects.Grupa;
import bicpi.server.features.objects.data.entities.GrupaEntity;

public class GrupaTransformer {

    public Grupa getModelFrom(GrupaEntity grupaEntity) {
        return new Grupa(grupaEntity.getIdgrupa(), grupaEntity.getNaziv());
    }
}