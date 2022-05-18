package bicpi.server.features.objects.data.exceptions;

public class RentabilniArtiklNotFoundException extends Exception {

    public RentabilniArtiklNotFoundException() {
        super("No rentabilni arikls found in database");
    }
}
