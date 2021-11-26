package Homework.Cars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Engine {
    public static void main(String[] args) {
        //Example of using maps and converting Array -> Maps
    Car[] c = new Car[10];
    for (int i = 0; i < c.length; i++) {
        c[i] = new Car("QWE" + i, "black", new Engine());
    }
    List<Car> l = new ArrayList(Arrays.asList(c));
    Map<String, Car> m = new HashMap<String, Car>();
    for (Car c1 : l) {
        m.put(c1.getVinNumber(), c1);
    }
    List<Car> l2 = new ArrayList<Car>(m.values());
    Set<String> s = new HashSet<String>(m.keySet());
    int lp = 1;
    for (String stringVin : s) {
        // System.out.println("VIN of Car: " + stringVin);
        System.out.printf("%d. VIN of Car: %s\n", lp++, stringVin);
        System.out.println(lp++ + ". VIN of Car: "+ stringVin);
        // System.out.printf("VIN of Car: %d\n", lp++);
    }

        for (Car car : l2) {
            System.out.printf("%d. VIN of Car: %S, Power of Engine: %f\n", lp++, car.getVinNumber(), car.getPowerOfEngine());
        }
}}

