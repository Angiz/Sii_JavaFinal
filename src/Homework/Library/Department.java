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
        else if (listOfCustomers.contains(c) && !(availableBooks.contains(b))){
            checkOutFromAnotherDepartment(b, d);
            availableBooks.remove(b);
            c.getListOfPossessedBooks().add(b);
        }
        else if(!(listOfCustomers.contains(c)) && availableBooks.contains(b)) {
          listOfCustomers.add(c);
            availableBooks.remove(b);
            c.getListOfPossessedBooks().add(b);
        }
        else {
            listOfCustomers.add(c);
            checkOutFromAnotherDepartment(b,d);
            availableBooks.remove(b);
            c.getListOfPossessedBooks().add(b);
        }

    }

    public void checkOutFromAnotherDepartment(Book b, Department d) {
        d.availableBooks.remove(b);
        availableBooks.add(b);
    }

    public void returnABookToOwnerDepartment(Book b, Department d) {
        if (!(b.ownerDepartment.equals(this))) {
            availableBooks.remove(b);
            d.availableBooks.add(b);
        }
    }
    class Branch {

    }
}
