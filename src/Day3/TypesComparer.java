package Day3;

public class TypesComparer {

    public static void main(String[] args) {
        System.out.println("Strings:");
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println("-------------------------");

        System.out.println("Integers:");
        int z1 = 10;
        int z2 = 10;

        @SuppressWarnings("deprecation")
        Integer o1 = new Integer(10);
        Integer o2 = new Integer(10);
        Integer o3 = 10;
        Integer o4 = 10;

        //== - reference comparer
        // new -> new reference
        System.out.println(z1==z2);
        System.out.println(o1==o2);
        System.out.println(o3==o4);
        System.out.println(o1==z1);
        System.out.println(o3==o1);


        Integer o5 = 5; //new Integer(5)
        o5 = 10;

        System.out.println("--------------------------");
        System.out.println(o5==o4);

        System.out.println("--------------------------");

        //bit transfer
        System.out.println("Bit transfer:");
        int i = 17;
        //*
        System.out.println(i<<4); //it's quicker
        System.out.println(i*16);

        // /
        System.out.println(i>>1);
        System.out.println(i/2);

        System.out.println(~i); //logic negation
    }
}
