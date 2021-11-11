package Homework.University;

public class Conf {
    StudentDB sDB = new StudentDB();
    FacultyDB fDB = new FacultyDB();
    //1
    Faculty faculty1 = fDB.computerScience;
    Student student1 = sDB.adamStudencki;

    //2
    Faculty faculty2 = fDB.medicine;
    Student student2 = sDB.annaNowak;

    //3
    Faculty faculty3From = fDB.computerScience;
    Faculty faculty3To = fDB.law;
    Student student3 = sDB.adamStudencki;
}
