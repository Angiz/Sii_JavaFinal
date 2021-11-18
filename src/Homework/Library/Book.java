package Homework.Library;

public class Book {
    Department.Branch branch;
    Category category;
    private String author;
    private String description;
    private int timeOfCheckout;

    public Book(Department.Branch branch, Category category, String author, String description, int timeOfCheckout) {
        this.branch = branch;
        this.category = category;
        this.author = author;
        this.description = description;
        this.timeOfCheckout = timeOfCheckout;
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
}
