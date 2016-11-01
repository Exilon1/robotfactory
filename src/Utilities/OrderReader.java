package Utilities;

import Entity.Order;

/**
 * Created by Alexey on 30.10.2016.
 */
public class OrderReader {

    private OrderReader() {
    }

    private static class SingletonHelper {
        private static final OrderReader SINGLETON = new OrderReader();
    }

    public static OrderReader getInstance() {
        return SingletonHelper.SINGLETON;
    }

    public static Order orderRead() {
        return null;
    }


}
