package bicpi.server.features.objects.data.transformers;


import bicpi.models.features.objects.Kupac;
import bicpi.server.features.objects.data.entities.KupacEntity;

public class KupacTransformer {

    public Kupac getModelFrom(KupacEntity kupacEntity) {
        return new Kupac(kupacEntity.getIdkorisnik(), kupacEntity.getOib(), kupacEntity.getAdresa());
    }
}