package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        String pattern = "^([A-Za-z]{2})*[\\s]*[0-9]{2}[\\s]*([0-9]{4}[\\s]*){6}$";
        String iban = "PL13 2222 3333 4343 4343 5454 5454";
        String iban1 = "13 2222 3333 4343 4343 5454 5454";
        String iban2 = "PL13222233334343434354545454";
        String iban3 = "Pl13 2222 3333 4343 4343 5454 5454 1";
        List<String> listOfAccounts = new ArrayList<String>();
        listOfAccounts.add(iban);
        listOfAccounts.add(iban1);
        listOfAccounts.add(iban2);
        listOfAccounts.add(iban3);

        System.out.println("Loop:");
        for (String acc: listOfAccounts) {
            System.out.printf("Account %s is %s", acc, checkAccount(acc, pattern)?"valid\n":"invalid\n");
        }

        System.out.println("\nLambda:");
        listOfAccounts.forEach((acc) -> System.out.printf("Account %s is %s", acc, checkAccount(acc, pattern)?"valid\n":"invalid\n"));
    }

    public static boolean checkAccount(String s, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
}
