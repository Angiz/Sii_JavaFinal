package Homework.Library;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    List<Book> listOfPossessedBooks = new ArrayList<>();
    public abstract void putPenalty();
    public void returnABook(Book b, Department d) {

    }

    public List<Book> getListOfPossessedBooks() {
        return listOfPossessedBooks;
    }
}
