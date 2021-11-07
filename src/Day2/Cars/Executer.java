package Day2.Cars;

import java.util.Scanner;

public class Executer {

    public static void main(String[] args) {
        Colours c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of wheels: ");
        int amountOfWheels = scanner.nextInt();
        System.out.println("Amount of passengers: ");
        int amountOfPassengers = scanner.nextInt();
        System.out.println("PowerOfEngine: ");
        float powerOfEngine = scanner.nextFloat();
        System.out.println("Colour: ");
        String colour = scanner.next().toLowerCase();


        Car car = new Car(7, 5);
        Car truck = new Car(12, 2, -125.34f);
        Car car2 = new Car(4, 5, -143.55f, Colours.BLUE.getProperString());
        Car scannerCar = new Car(amountOfWheels, amountOfPassengers, powerOfEngine, colour);
        System.out.println(scannerCar.stringComparer(colour));


        System.out.println(scannerCar);
    }
}
