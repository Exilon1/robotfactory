package util;

import factory.AbstractDetailFactory;
import factory.AppleFactory;
import factory.SamsungFactory;
import factory.SonyFactory;
import products.bodies.AbstractBody;
import products.bodies.AppleBody;
import products.bodies.SamsungBody;
import products.bodies.SonyBody;
import products.hands.AbstractHand;
import products.hands.AppleHend;
import products.hands.SamsungHand;
import products.hands.SonyHand;
import products.heads.AbstractHead;
import products.heads.AppleHead;
import products.heads.SamsungHead;
import products.heads.SonyHead;
import products.legs.AbstractLeg;
import products.legs.AppleLeg;
import products.legs.SamsungLeg;
import products.legs.SonyLeg;

import java.security.PublicKey;

/**
 * Created by Alexey on 08.11.2016.
 */
public class OrderExecutor {

    private OrderExecutor() {
    }

    private static class SingletonHelper {
        private static final OrderExecutor SINGLETON = new OrderExecutor();
    }

    public static OrderExecutor getInstance() {
        return SingletonHelper.SINGLETON;
    }


    AbstractDetailFactory appleFactory = new AppleFactory();
    AbstractDetailFactory samsungFactory = new SamsungFactory();
    AbstractDetailFactory sonyFactory = new SonyFactory();

    AbstractHead head;
    AbstractBody body;
    AbstractHand leftHand;
    AbstractHand rightHand;
    AbstractLeg leftLeg;
    AbstractLeg rightLeg;

    public void readAndCreate(String request) {
        String[] order = request.split("/");

        int i = 0;
        for(String s: order) {
            switch (i) {
                case 0: {
                    switch (s) {
                        case "Apple": head = appleFactory.createHead(); break;
                        case "Samsung": head = samsungFactory.createHead(); break;
                        case "Sony": head = sonyFactory.createHead(); break;
                    }
                } break;
                case 1: {
                    switch (s) {
                        case "Apple": body = appleFactory.createBody(); break;
                        case "Samsung": body = samsungFactory.createBody(); break;
                        case "Sony": body = sonyFactory.createBody(); break;
                    }
                } break;
                case 2: {
                    switch (s) {
                        case "Apple": leftHand = appleFactory.createHand("Left"); break;
                        case "Samsung": leftHand = samsungFactory.createHand("Left"); break;
                        case "Sony": leftHand = sonyFactory.createHand("Left"); break;
                    }
                } break;
                case 3: {
                    switch (s) {
                        case "Apple": rightHand = appleFactory.createHand("Right"); break;
                        case "Samsung": rightHand = samsungFactory.createHand("Right"); break;
                        case "Sony": rightHand = sonyFactory.createHand("Right"); break;
                    }
                } break;
                case 4: {
                    switch (s) {
                        case "Apple": leftLeg = appleFactory.createLeg("Left"); break;
                        case "Samsung": leftLeg = samsungFactory.createLeg("Left"); break;
                        case "Sony": leftLeg = sonyFactory.createLeg("Left"); break;
                    }
                } break;
                case 5: {
                    switch (s) {
                        case "Apple": rightLeg = appleFactory.createLeg("Right"); break;
                        case "Samsung": rightLeg = samsungFactory.createLeg("Right"); break;
                        case "Sony": rightLeg = sonyFactory.createLeg("Right"); break;
                    }
                } break;
            }
            i++;
        }
    }

    public AbstractBody asssemdlyRobot() {
        body.attachHead(head);
        body.attachHends(leftHand, rightHand);
        body.attachLegs(leftLeg, rightLeg);
        return body;
    }
}
