package Homework.University;

import Homework.University.Faculty;
import Homework.University.Student;

import java.util.ArrayList;

public class FacultyDB {
    ArrayList<Student> listOfStudents = new ArrayList<>();
    Faculty law = new Faculty(50,  "Law", this.listOfStudents);
    Faculty medicine = new Faculty(100, "Medicine", this.listOfStudents);
    Faculty computerScience = new Faculty(500, "Computer science", this.listOfStudents);
    Faculty physics = new Faculty(30, "Psysics", this.listOfStudents);


}
