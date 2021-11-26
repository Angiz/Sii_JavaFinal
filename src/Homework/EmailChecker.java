package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {

    public static void main(String[] args) {
        String pattern = "^([a-z0-9]+(\\-|\\.|\\_)*[a-z0-9]+)+@([a-z]*\\.){1,2}[a-z]{2,3}$";
        String email = "julia.tworek@gmail.com";
        String email1 = "example@example.com";
        String email2 = "I_AM_ALSO_AN_EMAIL@yahoo.com.pl";
        String email3 = "this is not an email@mail.ru";
        List<String> emailList = new ArrayList<String>();
        emailList.add(email);
        emailList.add(email1);
        emailList.add(email2);
        emailList.add(email3);

        emailList.forEach((el) -> System.out.printf("Email %s is %s e-mail address\n", el, isEmailOK(el, pattern)?"a valid": "an invalid"));
    }
    public static boolean isEmailOK(String s, String p) {
        Pattern pattern = Pattern.compile(p, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        boolean b = matcher.matches();
        return b;
    }
}




