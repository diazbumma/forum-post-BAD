package com.diazbumma;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatting3 {

    public static void main(String[] args) {
        //display date time country format
        Date tglWaktu = new Date(System.currentTimeMillis());
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern( "hh:mm a" );

        Locale locale = new Locale("id", "ID");
        String output = localTime.format(format.withLocale(locale));
        System.out.println("waktu indonesia:  " + locale.getDisplayName() + " ➙ " + output);

        //roll month and hour
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println("tanggal sekarang: "+ date.toString());

        calendar. roll(Calendar.MONTH, 1);
        System.out.println("tanggal setelah sebulan: " + calendar.getTime().toString());

        calendar. roll(Calendar.HOUR, 2);
        System.out.println("setelah 2 jam: " + calendar.getTime().toString());
    }
}
