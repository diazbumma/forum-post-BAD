package com.diazbumma;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting2 {

    public static void main(String[] args) {
        Date tglWaktu = new Date(System.currentTimeMillis());

        SimpleDateFormat textFormat= new SimpleDateFormat("'waktu (AMP/PM), zona:' hh:mm aaa, z");
        System.out.println(textFormat.format(tglWaktu));

        SimpleDateFormat textFormat2 = new SimpleDateFormat("'name of a month:' MMM");
        System.out.println(textFormat2.format(tglWaktu));

        SimpleDateFormat textFormat3 = new SimpleDateFormat("'hour and minute:' hh:mm");
        System.out.println(textFormat3.format(tglWaktu));

        SimpleDateFormat textFormat4 = new SimpleDateFormat("'current date time:' yyyy-MM-dd HH:mm:ss");
        System.out.println(textFormat4.format(tglWaktu));

        SimpleDateFormat textFormat5 = new SimpleDateFormat("'current time (24 hour):' HH:mm");
        System.out.println(textFormat5.format(tglWaktu));
    }
}
