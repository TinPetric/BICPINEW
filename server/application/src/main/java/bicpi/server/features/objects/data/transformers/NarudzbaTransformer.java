package bicpi.server.features.objects.data.transformers;

import bicpi.models.features.objects.Narudzba;
import bicpi.server.features.objects.data.entities.NarudzbaEntity;

public class NarudzbaTransformer {

    public Narudzba getModelFrom(NarudzbaEntity narudzbaEntity) {
        return new Narudzba(narudzbaEntity.getIdnarudzba(),narudzbaEntity.getIdkorisnik(),narudzbaEntity.getDatumvrijeme());
    }
}