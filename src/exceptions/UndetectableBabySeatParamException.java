package exceptions;

/**
 * Created by Nikotin on 02.11.2016.
 */
public class UndetectableBabySeatParamException extends Exception {
    @Override
    public String getMessage() {
        return "This parameter can be only \"да\" or \"нет\".";
    }
}
