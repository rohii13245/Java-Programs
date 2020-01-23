package dateAndTime;

import java.util.Calendar;

public class FindDateAndTime {

    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();

        int Year=2018;
        int month=10;
        int day=11;

        calendar.set(Calendar.YEAR,Year);
        calendar.set(Calendar.YEAR,month);
        calendar.set(Calendar.YEAR,day);

        System.out.println(calendar.getTime());

    }
}
