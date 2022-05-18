package bicpi.server.features.objects.data.transformers;

import bicpi.models.features.objects.Korisnik;
import bicpi.server.features.objects.data.entities.KorisnikEntity;

public class KorisnikTransformer {

    public Korisnik getModelFrom(KorisnikEntity korisnikEntity) {
        return new Korisnik(korisnikEntity.getIdkorisnik(), korisnikEntity.getIme(), korisnikEntity.getPrezime(), korisnikEntity.getKorisnickoime(), korisnikEntity.getLozinka());
    }
}