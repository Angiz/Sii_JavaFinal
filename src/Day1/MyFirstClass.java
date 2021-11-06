package Day1;

public class MyFirstClass {

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.getNameAndPrintIt();
        System.out.println(hello.getNameAndReturnIt());

        //sc.close() - if there is something different than keyboard (file, network connection etc.)

        Enums enums = Enums.WINTER; //it's only name. It has no value
        System.out.println(enums);
    }
}
