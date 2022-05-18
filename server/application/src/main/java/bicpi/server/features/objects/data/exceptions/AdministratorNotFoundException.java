package bicpi.server.features.objects.data.exceptions;

public class AdministratorNotFoundException extends Exception {

    public AdministratorNotFoundException() {
        super("No administrator found in database");
    }
}
