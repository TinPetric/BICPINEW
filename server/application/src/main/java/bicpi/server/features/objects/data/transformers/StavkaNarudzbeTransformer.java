package bicpi.server.features.objects.data.transformers;

import bicpi.models.features.objects.StavkaNarudzbe;
import bicpi.server.features.objects.data.entities.StavkaNarudzbeEntity;

public class StavkaNarudzbeTransformer {

    public StavkaNarudzbe getModelFrom(StavkaNarudzbeEntity stavkaNarudzbeEntity) {
        return new StavkaNarudzbe(stavkaNarudzbeEntity.getIdnarudzba(), stavkaNarudzbeEntity.getSifartikl(), stavkaNarudzbeEntity.getJedcijena(), stavkaNarudzbeEntity.getKolicina(), stavkaNarudzbeEntity.getRentoddatum(), stavkaNarudzbeEntity.getRentdodatum());
    }
}