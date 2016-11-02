package exceptions;

/**
 * Created by Nikotin on 02.11.2016.
 */
public class NotCompleteRequestException extends Exception {
    @Override
    public String getMessage() {
        return "The request isn't complete.";
    }
}
