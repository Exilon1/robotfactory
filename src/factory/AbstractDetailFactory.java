package factory;

import products.bodies.AbstractBody;
import products.hands.AbstractHand;
import products.heads.AbstractHead;
import products.legs.AbstractLeg;

/**
 * Created by Alexey on 06.11.2016.
 */
public interface AbstractDetailFactory {

    AbstractBody createBody();
    AbstractHead createHead();
    AbstractLeg createLeg(String type);
    AbstractHand createHand(String type);
}
