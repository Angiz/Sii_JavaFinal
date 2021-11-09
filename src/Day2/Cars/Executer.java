package Day2.Cars;

import java.util.Scanner;

public class Executer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car(7, 5);
        Car truck = new Car(12, 2, -125.34f);
        Car car2 = new Car(4, 5, -143.55f, Colours.BLUE.getProperString());
        System.out.println(manualCarCreator(scanner));
    }

    public static Car manualCarCreator(Scanner sc) {
        System.out.println("Amount of wheels: ");
        int amountOfWheels = sc.nextInt();
        System.out.println("Amount of passengers: ");
        int amountOfPassengers = sc.nextInt();
        System.out.println("PowerOfEngine: ");
        float powerOfEngine = sc.nextFloat();
        System.out.println("Colour: ");
        String colour = sc.next().toLowerCase();

        Car scannerCar = new Car(amountOfWheels, amountOfPassengers, powerOfEngine);
        String newColour = scannerCar.stringComparer(colour);
        scannerCar.setColour(newColour);

        return scannerCar;
    }

}
