package com.diazbumma;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> listInteger = new LinkedList<>();

        listInteger.add(1);
        listInteger.add(14);
        listInteger.add(46);
        listInteger.add(76);

        System.out.println("isi list: " + listInteger);

        System.out.println("hapus index 1: " + listInteger.remove(1));
        System.out.println("list sekarang: " + listInteger);
    }
}
