import Entity.*;
import Utilities.*;

import java.util.List;
import java.util.Scanner;

/**
 * Created by дима on 30.10.2016.
 */
public class main {
    public static void main(String[] args) {
        List<Car> carList = Initialization.initCarArray();
        Scanner scanner = new Scanner(System.in);

        Runnable trede = new Runnable() {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                while (true) {

                    String request = scanner.nextLine();
                    Order order = null;
                    try {
                        order = OrderReader.orderRead(request);
                        System.out.println(order);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    CarSearch.searchFreeCar(carList, order);
                }
            }
        };
        trede.run();

    }
}
