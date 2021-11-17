package Day4;

import java.util.ArrayList;
import java.util.List;

public class PeselChecker {
    //306
        interface FunctionalInterface {
            boolean operation(String arg);
        }

        private boolean oper(String arg, FunctionalInterface isPeselOK) {
            return isPeselOK.operation(arg);
        }

        public static void main(String[] args) {

            FunctionalInterface isPeselOK = (arg) -> {
                int[] tab = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
                int controlSum = 0;
                for (byte i = 1; i <= tab.length; i++) {
                    controlSum += Integer.parseInt(arg.substring(i - 1, i)) * tab[i - 1];
                }

                int checkDigit = (10 - controlSum % 10) % 10;
                return (checkDigit == Integer.parseInt(arg.substring(10, 11))) ? true : false;
            };

            PeselChecker checkerObj = new PeselChecker();

            boolean result = checkerObj.oper(args[0], isPeselOK);

            System.out.println("PESEL: " + args[0] + " is: " + result);
        }
}

