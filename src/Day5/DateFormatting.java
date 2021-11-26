package Day5;

import java.util.Date;
public class DateFormatting {

    public static void main(String[] args) {
        // %b true/false %B TRUE/FALSE

        Date date = new Date();
        System.out.printf("%tT%n", date);
        System.out.printf("Hour %tH, Minutes %tM, Seconds %tS %n", date, date, date);

        System.out.printf("%1$tz%n", date);
        System.out.printf("%1$tA%n", date);
        System.out.printf("%1$td %1$tB%n", date, date);
        System.out.printf("%1$tY%n", date);

        // %1$ - info about formatting
        // td - day, tm - month, ty - year
        System.out.printf("%1$td/%1$tm/%1$ty\n", date);

        System.out.println(Integer.toHexString(37364));
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(10.15f)));
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(10.15)));
    }



}
