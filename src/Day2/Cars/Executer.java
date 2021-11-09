package Day2.Cars;

import java.util.Scanner;

public class Executer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car(7, 5);
        Car truck = new Car(12, 2, -125);
        Car car2 = new Car(4, 5, -143, Colours.BLUE.getProperString());
        //car.vimCreator(9);
        //car.registrationNumberCreator(101);
        //System.out.println(car.setPowerOfEngine());
        //System.out.println(manualCarCreator(scanner));
        automaticCarCreator(5, 10000);
    }

    public static Car manualCarCreator(Scanner sc) {
        System.out.println("Amount of wheels: ");
        int amountOfWheels = sc.nextInt();
        System.out.println("Amount of passengers: ");
        int amountOfPassengers = sc.nextInt();
        System.out.println("PowerOfEngine: ");
        int powerOfEngine = sc.nextInt();
        System.out.println("Colour: ");
        String colour = sc.next().toLowerCase();

        Car scannerCar = new Car(amountOfWheels, amountOfPassengers, powerOfEngine);
        String newColour = scannerCar.stringComparer(colour);
        scannerCar.setColour(newColour);

        return scannerCar;
    }

    public static void automaticCarCreator(int i, int numberOfCars) {
        Car[] cars = new Car[numberOfCars];
        for (i=0; i<numberOfCars; i++) {
            cars[i] = new Car(i);
            System.out.println(cars[i]);
        }

    }

}
