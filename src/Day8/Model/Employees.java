package Day8.Model;

public class Employees {
    private String name;
    private String surname;
    private int salary;
    private double commision;
    private String position;
    private String depName;
    private String country;

    public Employees(String name, String surname, int salary, double commision, String position, String depName, String country) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.commision = commision;
        this.position = position;
        this.depName = depName;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public double getCommision() {
        return commision;
    }

    public String getPosition() {
        return position;
    }

    public String getDepName() {
        return depName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", commision=" + commision +
                ", position='" + position + '\'' +
                ", depName='" + depName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
