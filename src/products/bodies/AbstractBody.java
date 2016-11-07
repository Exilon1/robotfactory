package products.bodies;

import products.AbstractDetail;
import products.hands.AbstractHand;
import products.heads.AbstractHead;
import products.legs.AbstractLeg;

/**
 * Created by Alexey on 07.11.2016.
 */
public abstract class AbstractBody implements AbstractDetail {

    private AbstractHand[] hends;
    private AbstractLeg[] legs;
    private AbstractHead head;

    public void attachHends(AbstractHand... hends) {
        this.hends = hends;
    }
    public void attachLegs(AbstractLeg... legs) {
        this.legs = legs;
    }
    public void attachHead(AbstractHead head) {
        this.head = head;
    }


}
