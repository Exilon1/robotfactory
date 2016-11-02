package Utilities;

import Entity.*;

import java.util.List;

/**
 * Created by Alexey on 30.10.2016.
 */
public class CarSearch {

    public synchronized static void searchFreeCar(List<Car> carArrayList, Order order) {
        Car car;
        for(Car c: carArrayList) {
            if(isSuitableCar(c, order)) {
                car = c;
                break;
            }
        }
        //TODO
    }

    private static boolean isSuitableCar(Car car, Order order) {
    //    System.out.println(car);

        boolean isSuitableCar = car.getCarClass()==order.getNeedCarClass() &&
                                car.isHaveBabySeat()==order.isNeedBabySeat() &&
                                car.isSmokeCar()==order.isNeedSmokeCar();
        return isSuitableCar;
    }
}
