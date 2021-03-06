import products.bodies.AbstractBody;
import util.OrderExecutor;

import java.util.Scanner;

/**
 * Created by Alexey on 6.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        OrderExecutor executor = OrderExecutor.getInstance();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Указать лишь марку в форме\n" +
                "head/body/left_hand/right_hand/left_leg/right_leg");
        System.out.println();

        String request;
        while (true) {
            request = scanner.nextLine();
            executor.readAndCreate(request);
            AbstractBody robot = executor.asssemdlyRobot();
            robot.test();
        }
    }
}
