package bicpi.server.features.objects.data.exceptions;

public class KupovniArtiklNotFoundException extends Exception {

    public KupovniArtiklNotFoundException() {
        super("No kupovni artikls found in database");
    }
}
