package Homework.Library;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private static final int TIME_OF_CHECKOUT = 14;
    List<Book> availableBooks = new ArrayList<>();
    List<Customer> listOfCustomers = new ArrayList<>();

    public void checkOutToCustomer(Book b, Customer c, Department d) {
        if (listOfCustomers.contains(c) && availableBooks.contains(b)) {
            availableBooks.remove(b);
            c.getListOfPossessedBooks().add(b);
        }
        else {
            checkOutToAnotherDepartment(b, d);
        }

    }

    public void checkOutToAnotherDepartment(Book b, Department d) {

    }

    class Branch {

    }
}
