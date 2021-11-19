package Homework.Library;

public class Book {
    Department.Branch branch;
    Category category;
    private String author;
    private String description;
    private int timeOfCheckout;
    private int id;
    Department ownerDepartment;

    public Book(Department.Branch branch, Category category, String author, String description, int timeOfCheckout,
                int id, Department ownerDepartment) {
        this.branch = branch;
        this.category = category;
        this.author = author;
        this.description = description;
        this.timeOfCheckout = timeOfCheckout;
        this.id = id;
        this.ownerDepartment = ownerDepartment;
    }

    public Department.Branch getBranch() {
        return branch;
    }

    public Category getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeOfCheckout() {
        return timeOfCheckout;
    }

    public Department getOwnerDepartment() {
        return ownerDepartment;
    }
}
