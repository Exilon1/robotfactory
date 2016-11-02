package exceptions;

/**
 * Created by Nikotin on 02.11.2016.
 */
public class NotValidCarClassException extends Exception {
    @Override
    public String getMessage() {
        return "This parameter can be only 1 or 0.";
    }
}
