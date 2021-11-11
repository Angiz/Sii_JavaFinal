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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                "surname='" + getSurname() + '\'' +
                "date of birth'" + getBirthDate() + '\'' +
                "PESEL'" + getPESEL() + '\'' +
                "indexNumber='" + indexNumber + '\'' +
                '}';
    }
}
