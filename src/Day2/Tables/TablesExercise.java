package Day2.Tables;

import java.util.Scanner;

public class TablesExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;


        int intTab[][] = new int[100][100];
        for (int i=0; i<intTab.length; i++) {
            for (int j=0; j<intTab[i].length; j++) {
                intTab[i][j] = ((i+1)*(j+1));
            }
        }

        while (true) {
            System.out.println("1st Number: ");
            x = scanner.nextInt();
            System.out.println("2nd Number: ");
            y = scanner.nextInt();
            if (x>=1 && x<=100 && y>=1 && y<=100) {
                break;
            } else {
                System.out.println("One or more values are invalid");
            }

        }
            System.out.println("Result: "+intTab[x-1][y-1]);

    }
}

