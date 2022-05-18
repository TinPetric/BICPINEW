package bicpi.server.features.objects.data.exceptions;

public class StavkaNarudzbeNotFoundException extends Exception {

    public StavkaNarudzbeNotFoundException() {
        super("No stavkas narudzbes found in database");
    }
}
