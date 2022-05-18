package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.ArtiklEntity;
import bicpi.server.features.objects.data.entities.KorisnikEntity;
import bicpi.server.features.objects.data.exceptions.ArtiklNotFoundException;
import bicpi.server.features.objects.data.exceptions.KorisnikNotFoundException;

import java.util.List;

public interface KorisnikDao {

    List<KorisnikEntity> getKorisnik() throws KorisnikNotFoundException;

}
