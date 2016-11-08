package util;

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
                        case "Apple": head = new AppleHead(); break;
                        case "Samsung": head = new SamsungHead(); break;
                        case "Sony": head = new SonyHead(); break;
                    }
                } break;
                case 1: {
                    switch (s) {
                        case "Apple": body = new AppleBody(); break;
                        case "Samsung": body = new SamsungBody(); break;
                        case "Sony": body = new SonyBody(); break;
                    }
                } break;
                case 2: {
                    switch (s) {
                        case "Apple": leftHand = new AppleHend("Left"); break;
                        case "Samsung": leftHand = new SamsungHand("Left"); break;
                        case "Sony": leftHand = new SonyHand("Left"); break;
                    }
                } break;
                case 3: {
                    switch (s) {
                        case "Apple": rightHand = new AppleHend("Right"); break;
                        case "Samsung": rightHand = new SamsungHand("Right"); break;
                        case "Sony": rightHand = new SonyHand("Right"); break;
                    }
                } break;
                case 4: {
                    switch (s) {
                        case "Apple": leftLeg = new AppleLeg("Left"); break;
                        case "Samsung": leftLeg = new SamsungLeg("Left"); break;
                        case "Sony": leftLeg = new SonyLeg("Left"); break;
                    }
                } break;
                case 5: {
                    switch (s) {
                        case "Apple": rightLeg = new AppleLeg("Right"); break;
                        case "Samsung": rightLeg = new SamsungLeg("Right"); break;
                        case "Sony": rightLeg = new SonyLeg("Right"); break;
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
        return null;
    }
}
