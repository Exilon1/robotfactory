package products.hands;

import products.AbstractDetail;

/**
 * Created by Alexey on 07.11.2016.
 */
public abstract class AbstractHand implements AbstractDetail {

    private String type;

    AbstractHand(String type) {
        this.type = type;
    }
}
