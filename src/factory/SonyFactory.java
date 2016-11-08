package factory;

import products.bodies.AbstractBody;
import products.bodies.SonyBody;
import products.hands.AbstractHand;
import products.hands.SonyHand;
import products.heads.AbstractHead;
import products.heads.SonyHead;
import products.legs.AbstractLeg;
import products.legs.SonyLeg;

/**
 * Created by Alexey on 08.11.2016.
 */
public class SonyFactory implements AbstractDetailFactory {
    @Override
    public AbstractBody createBody() {
        return new SonyBody();
    }

    @Override
    public AbstractHead createHead() {
        return new SonyHead();
    }

    @Override
    public AbstractLeg createLeg(String type) {
        return new SonyLeg(type);
    }

    @Override
    public AbstractHand createHand(String type) {
        return new SonyHand(type);
    }
}
