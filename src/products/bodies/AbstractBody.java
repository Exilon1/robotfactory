package products.bodies;

import products.AbstractDetail;
import products.hands.AbstractHand;
import products.heads.AbstractHead;
import products.legs.AbstractLeg;

/**
 * Created by Alexey on 07.11.2016.
 */
public abstract class AbstractBody implements AbstractDetail {

    AbstractHand[] hends;
    AbstractLeg[] legs;
    AbstractHead head;

    public void attachHends(AbstractHand... hends) {
        this.hends = hends;
    }
    public void attachLegs(AbstractLeg... legs) {
        this.legs = legs;
    }
    public void attachHead(AbstractHead head) {
        this.head = head;
    }

    StringBuilder builder = new StringBuilder();

    @Override
    public void test() {
        if (hends!=null && legs!=null && head!=null) {
            builder.append(getMark());
            builder.append(" ");
            builder.append("body\n");
            for(AbstractHand hand: hends) {
                builder.append(hand.getMark());
                builder.append(" ");
                builder.append(hand.getType());
                builder.append("hand\n");
            }
            for(AbstractLeg leg: legs) {
                builder.append(leg.getMark());
                builder.append(" ");
                builder.append(leg.getType());
                builder.append("leg\n");
            }
            builder.append(head.getMark());
            builder.append(" ");
            builder.append("head\n");

            head.tellSomething("I'm a robot with\n" + builder.toString());
        }
        else System.out.println("I'm an Apple body and I don't have limbs.");
    }

}
