package bicpi.server.features.objects.data.exceptions;

public class KupacNotFoundException extends Exception {

    public KupacNotFoundException() {
        super("No kupacs found in database");
    }
}
