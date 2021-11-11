package Homework.University;

import java.util.Scanner;

import static Homework.University.Faculty.transferStudent;

public class Executer {

    public static void main(String[] args) {
        Conf c = new Conf();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?\n1. Add new student\n2. Remove student\n3. Transfer student");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                c.faculty1.addStudent(c.student1);
                System.out.println(c.faculty1);
                break;
            case 2:
                c.faculty2.removeStudent(c.student2);
                System.out.println(c.faculty2);
                break;
            case 3:
                transferStudent(c.faculty3From, c.faculty3To, c.student3);
                System.out.println("Previous faculty of student: "+c.faculty3From);
                System.out.println("Current faculty of student: "+c.faculty3To);
                break;
            default:
                break;
        }
    }
}
