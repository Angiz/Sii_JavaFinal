package Homework.University;

import java.util.ArrayList;

public class Faculty {
    private int maxStudents;
    private String name;
    ArrayList <Student> listOfStudents;

    public Faculty(int maxStudents, String name, ArrayList<Student> listOfStudents) {
        this.maxStudents = maxStudents;
        this.name = name;
        this.listOfStudents = listOfStudents;
    }


    public int getMaxStudents() {
        return maxStudents;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s) {
        if (listOfStudents.size() > maxStudents) {
            System.out.println("Maximum of students exceed!");
        }
        else
            listOfStudents.add(s);
    }

    public void removeStudent(Student s) {
        if (listOfStudents.contains(s)) {
            listOfStudents.remove(s);
        }
        else {
            System.out.println("Student not found");
        }
    }


    public static void transferStudent(Faculty from, Faculty to, Student s) {
        from.removeStudent(s);
        to.addStudent(s);
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "maxStudents=" + maxStudents +
                ", name='" + name + '\'' +
                ", listOfStudents=" + listOfStudents +
                '}';
    }
}
