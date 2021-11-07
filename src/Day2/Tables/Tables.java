package Day2.Tables;

public class Tables {

    public static void main(String[] args) {
        int intTab[][] = new int[5][];
        for (int i=0; i<intTab.length; i++) {
            intTab[i] = new int[(i+1)*2];
        }

        for (int i=0; i<intTab.length; i++) {
            for (int j=0; j<intTab[i].length; j++) {
                intTab[i][j] = (int)(1000 * Math.random());
            }
        }

        for (int[] is: intTab) {
            for (int i: is) {
                System.out.println(i);
            }
        }

    }

}
