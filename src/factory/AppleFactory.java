package factory;

import products.bodies.AbstractBody;
import products.bodies.AppleBody;
import products.hands.AbstractHand;
import products.hands.AppleHend;
import products.heads.AbstractHead;
import products.heads.AppleHead;
import products.legs.AbstractLeg;
import products.legs.AppleLeg;

/**
 * Created by Alexey on 08.11.2016.
 */
public class AppleFactory implements AbstractDetailFactory {
    @Override
    public AbstractBody createBody() {
        return new AppleBody();
    }

    @Override
    public AbstractHead createHead() {
        return new AppleHead();
    }

    @Override
    public AbstractLeg createLeg(String type) {
        return new AppleLeg(type);
    }

    @Override
    public AbstractHand createHand(String type) {
        return new AppleHend(type);
    }
}
