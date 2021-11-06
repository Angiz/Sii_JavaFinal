package Day1;

public class Finals {
    public static final String HELLO = "HELLO";
    public static final char UNICODE_TEST = '\u00C6';
    public static void main(String[] args) {
        Finals finals = new Finals();
        System.out.println(finals.UNICODE_TEST);
        final String s = "Hello";
    }

    public static void notMain() {
        final String s = "World";
    }
}
