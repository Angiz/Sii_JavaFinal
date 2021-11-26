package Homework.Library;

public enum Category {
    BESTSELLER("Bestseller",0.02, 1), NORMAL("Normal", 0.01, 0.5),
    OLD("Old", 0.01, 0.5);

    private String value;
    private double procPenalty;
    private double minPenalty;

    public String getValue() {
        return value;
    }

    public double getProcPenalty() {
        return procPenalty;
    }

    public double getMinPenalty() {
        return minPenalty;
    }

    Category(String value, double procPenalty, double minPenalty) {
        this.value = value;
        this.procPenalty = procPenalty;
        this.minPenalty = minPenalty;
    }
}
