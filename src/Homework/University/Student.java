package Homework.University;

public class Student extends Person {
    public String indexNumber;

    public Student(String name, String surname, String birthDate, String PESEL, String indexNumber) {
        super(name, surname, birthDate, PESEL);
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
