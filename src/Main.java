import Entity.*;
import Utilities.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by дима on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Car> carList = Initialization.initCarArray();
        Scanner scanner = new Scanner(System.in);

        Runnable trede = new Runnable() {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                while (true) {
                    FreeTheCar.freeTheCar(carList);

                    String request = scanner.nextLine();
                    Order order = null;
                    try {
                        order = OrderReader.orderRead(request);
                        if (order==null)
                            continue;
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    Car car = CarSearch.searchFreeCar(carList, order);
                    if (car == null) {
                        System.out.println("All cars are reserved. Please, try again later.");
                        continue;
                    }
                    System.out.println("Your car:");
                    System.out.println(car);
                }
            }
        };
        trede.run();

    }
}
