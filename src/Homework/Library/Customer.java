package Homework.Library;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    List<Book> listOfPossessedBooks = new ArrayList<>();
    private int maxBooks;
    private int maxBranchBooks;
    public abstract void putPenalty();

    public Customer(int maxBooks, int maxBranchBooks) {
        this.maxBooks = maxBooks;
        this.maxBranchBooks = maxBranchBooks;
    }

    public List<Book> getListOfPossessedBooks() {
        return listOfPossessedBooks;
    }
}
