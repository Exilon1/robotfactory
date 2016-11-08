package products.bodies;

import products.hands.AbstractHand;
import products.legs.AbstractLeg;

/**
 * Created by Alexey on 07.11.2016.
 */
public class AppleBody extends AbstractBody {

    private final String MARK = "Apple";

    @Override
    public String getMark() {
        return MARK;
    }
}
