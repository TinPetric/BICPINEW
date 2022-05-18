package bicpi.server.features.objects.data.exceptions;

public class GrupaNotFoundException extends Exception {

    public GrupaNotFoundException() {
        super("No grupas found in database");
    }
}
