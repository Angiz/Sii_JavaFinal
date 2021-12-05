package Homework.Library;

public class Organisation extends Customer {

    public Organisation() {
        super(10, 6);
    }

    @Override
    public void getPenalty() {
        int sumPenalty = 0;
        this.getListOfPossessedBooks().forEach((Book b) -> b.getCategory().getProcPenalty());

    }
}
