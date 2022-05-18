package bicpi.server.features.objects.data.exceptions;

public class KorisnikNotFoundException extends Exception {

    public KorisnikNotFoundException() {
        super("No korisniks found in database");
    }
}
