package Homework.LambdaExercises;

import java.util.Arrays;

public class ListingParameters {


    public static void main(String args[]) {
        Arrays.stream(args).forEach(arg -> System.out.println(arg));
    }
}
