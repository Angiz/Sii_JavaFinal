package Homework.Library;

public enum Category {
    BESTSELLER("Bestseller"), NORMAL("Normal"), OLD("Old");
    private String value;

    public String getValue() {
        return value;
    }

    Category(String value) {
        this.value = value;
    }
}
