package Day1;

public class SimpleTypes {
    static int standardVariable; //it has to be declared here to not throw an error and with static keyword
    public static void main(String[] args) {
        SimpleTypes simpleTypes = new SimpleTypes();
        simpleTypes.stringChecker();
        simpleTypes.digitChecker();
    }

    public void digitChecker() {
        long intDigit = 15; //this is default int
        long longDigit = 15L; //now it's long
        long bigL = 1_000_000_000_001L;
        double bigD = bigL;
        byte byteDigit = 15;

        double doubleDigit = 0.1234565662152d; // this is default double
        float floatDigit = 0.123456F; //this is float

        int a = 'a'; //it prints ASCII
        var x = 0; //it's possible to define var name

        System.out.println(bigL);
        System.out.println(bigD);
    }

    public void stringChecker() {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = "abc"; //s1 = s3
        String a = 1 + 2 + "3" + 4 + 5; //3345 - before string int, after this string
        String b = 1 + 2 + "3" + 4 * 5; //3320 - * is first in math
        s2 = s2 + "c";
        int f=0;
        int g=5;
        int h=2;
        int res = f !=0?g>5?h==2?h:0:g:f;
        //s1 != s2 <- ==
        //s1 = s2 <- equals
        //s1 = s2 <- in switch...case
        Boolean b1 = s1.equals(s2);
        int c = s1.compareTo(s2); //boolean but in int (0 = true) 0 means difference

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(c);
        System.out.println(standardVariable);

        if (s1 == s3) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //(condition)?(result if true):(result if false)

        System.out.println((s1 == s3)?"True":"False");
        System.out.println("Res: "+res);
    }


}
