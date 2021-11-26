package Homework.Library;

public class Person extends Customer {

    int numOfBestseller;
    public Person() {
        super(4, 2);
        this.numOfBestseller = 1;
    }

    @Override
    public void putPenalty() {

    }
}
