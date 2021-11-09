package Day2.Cars;

import java.util.Arrays;

public class Car {
    private int amountOfWheels;
    private int amountOfPassengers;
    private float powerOfEngine;
    private String colour;
    Colours[] colours = Colours.values();
    String colourStringValues[] = new String[colours.length];

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

    public Car(int amountOfWheels, int amountOfPassengers, float powerOfEngine) {
        this(amountOfWheels, amountOfPassengers);
        this.powerOfEngine = powerOfEngine < 0 ? -powerOfEngine : powerOfEngine;
    }

    public Car(int amountOfWheels, int amountOfPassengers, float powerOfEngine, String colour) {
        this(amountOfWheels, amountOfPassengers, powerOfEngine);
        this.colour = colour;
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

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
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


    @Override
        public String toString () {
            return "Car{" +
                    "amountOfWheels=" + amountOfWheels +
                    ", amountOfPassengers=" + amountOfPassengers +
                    ", powerOfEngine=" + powerOfEngine +
                    ", colour='" + colour + '\'' +
                    '}';
        }


}
