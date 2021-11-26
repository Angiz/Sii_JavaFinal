package Day5;

public class StringComparer {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        s1 = null;

        //NullPointerException validation

        if ((s1==null)?true:s1.equals(s2)) {
            System.out.println("It really helps!");
        }

    }
}
