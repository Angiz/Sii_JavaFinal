package Homework.Cars;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarStream {

    public static void main(String[] args) {
        Executer e = new Executer();
        //Car[] c = new Car[500];
        List<Car> listOfCars = new ArrayList<>();
        Stream<Car> carS = listOfCars.stream();

        long count = carS.distinct().count();
        System.out.println(count);

//        Stream<Car> st1 = Stream.generate(() -> new Car()).limit(30);
//        st1.forEach((c) -> {
//            c.setColour("Blue");
//            listOfCars.add(c);
//            return;
//        });

        //st1.forEach(listOfCars::add);

//        for (Car car: listOfCars) {
//            System.out.println(car.toString());
//        }

        listOfCars = Stream
                .generate(()-> new Car())
                .limit(5)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
