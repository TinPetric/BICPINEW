package bicpi.server.features.objects.data.exceptions;

public class ArtiklNotFoundException extends Exception {

    public ArtiklNotFoundException() {
        super("No artikls found in database");
    }
}
