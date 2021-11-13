package Homework.Cars;

import java.util.Arrays;

public class Car {
    private int amountOfWheels;
    private int amountOfPassengers;
    private int powerOfEngine;
    private String colour;
    Colours[] colours = Colours.values();
    String colourStringValues[] = new String[colours.length];
    private String vinNumber;
    private int capacityOfEngine;
    private String registrationNumber;
    private int carryingCapacity;

    public Car(int amountOfWheels, int amountOfPassengers) {
        if (amountOfWheels < 4) {
            amountOfWheels = 4;
        }
        if (amountOfWheels % 2 != 0) {
            amountOfWheels++;
        }
        this.amountOfWheels = amountOfWheels;
        this.amountOfPassengers = amountOfPassengers < 0 ? -amountOfPassengers : amountOfPassengers;
    }

    public Car(int amountOfWheels, int amountOfPassengers, int powerOfEngine) {
        this(amountOfWheels, amountOfPassengers);
        this.powerOfEngine = powerOfEngine < 0 ? -powerOfEngine : powerOfEngine;
    }

    public Car(int amountOfWheels, int amountOfPassengers, int powerOfEngine, String colour) {
        this(amountOfWheels, amountOfPassengers, powerOfEngine);
        this.colour = colour;
    }

    //constructor for automatic cars
    public Car(int i) {
        this.amountOfWheels = (int) ((Math.random() * (12-4)+4));
        if (amountOfWheels % 2 != 0) {
            amountOfWheels++;
        }
        this.amountOfPassengers = (int)(Math.random() * (40-2)+2);
        this.powerOfEngine = (int) (Math.random() * (120-100) + 100);
        this.vinNumber = String.format("VJX0%05d23E", i);
        this.capacityOfEngine = (int) (Math.random() * (120-100) + 100);
        this.registrationNumber = String.format("ZS%02dA", i);
        this.carryingCapacity = (int) (Math.random() * (120-100) + 100);
        coloursCreator();
        this.colour = colourStringValues[(int)(Math.random() * (colours.length))];
    }

    //constructor for manual cars
    public Car(int amountOfWheels, int amountOfPassengers, int powerOfEngine,  int valuesForVin, int valuesForRegistrationNumbers,
               int capacityOfEngine,  int carryingCapacity) {
        this(amountOfWheels, amountOfPassengers, powerOfEngine);
        this.vinNumber = String.format("VJX0%05d23E", valuesForVin); //can be made with substring() method
        this.capacityOfEngine = capacityOfEngine;
        this.registrationNumber = String.format("ZS%02dA", valuesForRegistrationNumbers); //can be made with substring() method
        this.carryingCapacity = carryingCapacity;
    }


    public String getVinNumber() {
        return vinNumber;
    }

    public int getCapacityOfEngine() {
        return capacityOfEngine;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public float getPowerOfEngine() {
        return powerOfEngine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String stringComparer(String firstString) {
        //creating new table with colour string values
        for (int i=0; i<colours.length; i++) {
            colourStringValues[i] = colours[i].getProperString();
        }
        for (Colours c: colours) {
            if (firstString.equals(c.getProperString())) {
                firstString = c.getProperString();
                break;
            }
        }
        if (!(Arrays.asList(colourStringValues).contains(firstString))) {
            firstString = colours[colours.length-1].getProperString();
        }
        return firstString;
    }

    public String[] coloursCreator() {
        for (int i=0; i<colours.length; i++) {
            colourStringValues[i] = colours[i].getProperString();
        }
        return colourStringValues;
    }

    @Override
    public String toString() {
        return "Car{" +
                "amountOfWheels=" + amountOfWheels +
                ", amountOfPassengers=" + amountOfPassengers +
                ", powerOfEngine=" + powerOfEngine +
                ", colour='" + colour + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", capacityOfEngine=" + capacityOfEngine +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}
