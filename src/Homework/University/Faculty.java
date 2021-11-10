package Homework.University;

import java.util.ArrayList;

public class Faculty {
    private int maxStudents;
    private int amountOfStudents;
    private String name;
    Faculty[] listOfFaculties = new Faculty[maxStudents];

    public Faculty(int maxStudents, int amountOfStudents, String name) {
        this.maxStudents = maxStudents;
        this.amountOfStudents = amountOfStudents;
        this.name = name;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public String getName() {
        return name;
    }

    public void addStudent(ArrayList <Faculty> f) {
        // do sth
    }

    public void removeStudent(ArrayList <Faculty> f) {
        // do sth
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void transferStudent(Faculty from, Faculty to, Student s) {
        //do sth
    }
}
