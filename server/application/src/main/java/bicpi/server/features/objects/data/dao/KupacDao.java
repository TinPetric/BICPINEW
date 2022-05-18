package bicpi.server.features.objects.data.dao;

import bicpi.server.features.objects.data.entities.KorisnikEntity;
import bicpi.server.features.objects.data.entities.KupacEntity;
import bicpi.server.features.objects.data.exceptions.KorisnikNotFoundException;
import bicpi.server.features.objects.data.exceptions.KupacNotFoundException;

import java.util.List;

public interface KupacDao {

    List<KupacEntity> getKupac() throws KupacNotFoundException;

}
