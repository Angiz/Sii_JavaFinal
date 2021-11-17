package Homework.LambdaExercises;

public class SquareRoot {
    interface Square {
        double operation(int a);
    }

    public static void main(String[] args) {
        Square square = a -> Math.sqrt(a);
        System.out.println(square.operation(16));
    }
}
