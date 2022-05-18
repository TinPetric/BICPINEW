package bicpi.server.features.objects.data.exceptions;

public class NarudzbaNotFoundException extends Exception {

    public NarudzbaNotFoundException() {
        super("No narudzbas found in database");
    }
}

