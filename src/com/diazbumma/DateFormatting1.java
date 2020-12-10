package com.diazbumma;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting1 {

    public static void main(String[] args) {
        Date tglWaktu = new Date(System.currentTimeMillis());

        SimpleDateFormat textFormat= new SimpleDateFormat("'MMMM Format:' MMM");
        System.out.println(textFormat.format(tglWaktu));

        SimpleDateFormat textFormat2 = new SimpleDateFormat("'seconds:' ss");
        System.out.println(textFormat2.format(tglWaktu));

        SimpleDateFormat textFormat3 = new SimpleDateFormat("'month short format:' MMM");
        System.out.println(textFormat3.format(tglWaktu));

        SimpleDateFormat textFormat4 = new SimpleDateFormat("'weekdays name:' EEEE");
        System.out.println(textFormat4.format(tglWaktu));

        SimpleDateFormat textFormat5 = new SimpleDateFormat("'time to date:' yyyy-MM-dd HH:mm:ss");
        System.out.println(textFormat5.format(tglWaktu));
    }
}
