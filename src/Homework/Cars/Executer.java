package Homework.Cars;

import java.util.Scanner;

public class Executer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?\n1. Manually add a car.\n2. Automatic generate cars.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(manualCarCreator(scanner));
                break;
            case 2:
                System.out.println("Enter a number of cars: ");
                int numberOfCars = scanner.nextInt();
                automaticCarCreator(0, numberOfCars);
                break;
            default:
                break;
        }
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
        System.out.println("Values for VIN: ");
        int valuesForVin = sc.nextInt();
        System.out.println("Values for registration number: ");
        int valuesForRegistrationNumber = sc.nextInt();
        System.out.println("Capacity of engine: ");
        int capacityOfEngine = sc.nextInt();
        System.out.println("Carrying capacity: ");
        int carryingCapacity = sc.nextInt();

        Car scannerCar = new Car(amountOfWheels, amountOfPassengers, powerOfEngine, valuesForVin,
                valuesForRegistrationNumber, capacityOfEngine, carryingCapacity);
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
