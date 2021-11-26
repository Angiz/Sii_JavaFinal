package Day5;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        String txt = "fdfd|gfgdfg|sdfsdf|sdgdfgd";
        StringTokenizer stringTokenizer = new StringTokenizer(txt, "|");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }


}
