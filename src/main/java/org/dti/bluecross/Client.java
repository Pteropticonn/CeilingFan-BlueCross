package org.dti.bluecross;

import java.util.Scanner;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(Client.class.getName());

        CeilingFan ceilingFan = new CeilingFan();

        logger.info(() -> "Fan installed and powered on. Checking state: "
                + ceilingFan + "\n");

        //instantiate both cords and associate them with ceiling fan instance
        SpeedChangerCord speedChangerCord = new SpeedChangerCord(ceilingFan);
        DirectionReversalCord directionReversalCord = new DirectionReversalCord(ceilingFan);

        FanControlInvoker fanControlInvoker = new FanControlInvoker();

        System.out.println("Interact with fan by typing 's' to change the speed, 'r' to reverse direction, 'o' to observe the fan, or 'e' to exit");
        Scanner input = new Scanner(System.in);
        while (true) {
            String line = input.nextLine();
            if ("e".equalsIgnoreCase(line)) {
                System.out.println("You back away from the fan and exit the living room.");
                break;
            } else if ("s".equalsIgnoreCase(line)) {
                fanControlInvoker.setCord(speedChangerCord);
                fanControlInvoker.executeSelectedCommand();
            } else if ("r".equalsIgnoreCase(line)) {
                fanControlInvoker.setCord(directionReversalCord);
                fanControlInvoker.executeSelectedCommand();
            } else if ("o".equalsIgnoreCase(line)) {
                System.out.println("You stare more intently at the fan and notice..." + ceilingFan);
            } else {
                System.out.println("You accidentally trip while reaching for one of the cords. Please, be more careful!\n");
            }

        }

    }
}
