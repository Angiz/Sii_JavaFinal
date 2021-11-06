package Day1;

import java.util.Scanner;

public class Hello {

    // /** + Enter
    /**
     *
     * @author Aneta
     */
    public void getNameAndPrintIt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String name = sc.next();
        System.out.println("Hi, "+name);
    }

    public String getNameAndReturnIt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String name = sc.next();
        return name;
    }
}
