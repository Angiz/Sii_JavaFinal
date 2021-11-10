package Homework.University;

public class Person {
    private String name;
    private String surname;
    private String birthDate;
    private String PESEL;

    public Person(String name, String surname, String birthDate, String PESEL) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.PESEL = PESEL;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPESEL() {
        return PESEL;
    }
}
