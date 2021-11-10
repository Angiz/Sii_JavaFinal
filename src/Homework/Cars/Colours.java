package Homework.Cars;

public enum Colours {
    WHITE("white"), BLUE("blue"), BLACK("black"), RED("red"),
    PINK("pink"), YELLOW("yellow"), GREEN("green"), GREY("grey");

    private String properString;

    public String getProperString() {
        return properString;
    }

    Colours(String properString) {
        this.properString = properString;
    }
}
