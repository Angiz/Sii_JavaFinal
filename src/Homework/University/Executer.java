package Homework.University;

import java.util.ArrayList;

public class Executer {

    public static void main(String[] args) {
        Faculty law = new Faculty(50, 25, "Law");
        Faculty medicine = new Faculty(100, 50, "Medicine");
        Faculty computerScience = new Faculty(500, 100, "Computer science");
        Faculty physics = new Faculty(30, 10, "Psysics");

        Student janKowalski = new Student("Jan", "Kowalski", "2000-05-20",
                "00052012345", "12345");
        Student janNowak = new Student("Jan", "Nowak", "1995-02-05", "95020567539",
                "56456");
        Student annaNowak = new Student("Anna", "Nowak", "1993-10-05", "93100575305",
                "76866");
        Student juliaPiekara = new Student("Julia", "Piekara", "2001-05-03", "01050345655",
                "13545");
        Student adamStudencki = new Student("Adam", "Studencki", "1960-06-05",
                "600605655465", "56756");

    }
}
