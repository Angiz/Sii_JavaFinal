package Homework.Library;

public class Book {
    Department.Branch branch;
    Category category;
    private String author;
    private String description;
    private int timeOfCheckout;
    private String  id;
    private int price;
    Department ownerDepartment;

    public Book(Department.Branch branch, Category category, String author, String description, int timeOfCheckout,
                String id, Department ownerDepartment, int price) {
        this.branch = branch;
        this.category = category;
        this.author = author;
        this.description = description;
        this.timeOfCheckout = timeOfCheckout;
        this.id = ownerDepartment + id;
        this.ownerDepartment = ownerDepartment;
        this.price = price;
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

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Department getOwnerDepartment() {
        return ownerDepartment;
    }
}
