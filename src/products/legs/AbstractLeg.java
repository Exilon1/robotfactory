package products.legs;

import products.AbstractDetail;
import products.hands.AbstractHand;
import products.heads.AbstractHead;

/**
 * Created by Alexey on 07.11.2016.
 */
public abstract class AbstractLeg implements AbstractDetail {

    private String type;

    AbstractLeg(String type) {
        this.type = type;
    }
}
