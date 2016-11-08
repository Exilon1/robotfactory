package factory;

import products.bodies.AbstractBody;
import products.bodies.SamsungBody;
import products.hands.AbstractHand;
import products.hands.SamsungHand;
import products.heads.AbstractHead;
import products.heads.SamsungHead;
import products.legs.AbstractLeg;
import products.legs.SamsungLeg;

/**
 * Created by Alexey on 08.11.2016.
 */
public class SamsungFactory implements AbstractDetailFactory {
    @Override
    public AbstractBody createBody() {
        return new SamsungBody();
    }

    @Override
    public AbstractHead createHead() {
        return new SamsungHead();
    }

    @Override
    public AbstractLeg createLeg(String type) {
        return new SamsungLeg(type);
    }

    @Override
    public AbstractHand createHand(String type) {
        return new SamsungHand(type);
    }
}
