package com.diazbumma;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

    public static void main(String[] args) {
        Date tglWaktu = new Date(System.currentTimeMillis());

        SimpleDateFormat textFormat= new SimpleDateFormat("'MMMM format:' MMMM");
        System.out.println(textFormat.format(tglWaktu));

        SimpleDateFormat textFormat2 = new SimpleDateFormat("'seconds:' ss");
        System.out.println(textFormat2.format(tglWaktu));

        SimpleDateFormat textFormat3 = new SimpleDateFormat("'month in short format:' MMM");
        System.out.println(textFormat3.format(tglWaktu));

        SimpleDateFormat textFormat4 = new SimpleDateFormat("'name of weekdays:' EEEE");
        System.out.println(textFormat4.format(tglWaktu));

        SimpleDateFormat textFormat5 = new SimpleDateFormat("'tanggal:' yyyy-MM-dd 'waktu:' HH:mm:ss");
        System.out.println(textFormat5.format(tglWaktu));
    }
}
