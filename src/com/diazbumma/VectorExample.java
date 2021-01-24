package com.diazbumma;

import java.util.Collections;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(4);
        vector.add(7);
        vector.add(9);
        vector.add(10);
        vector.add(12);
        vector.add(14);
        vector.add(18);
        vector.add(19);
        vector.add(20);

        System.out.println("Nilai ditemukan di indeks: " + Collections.binarySearch(vector, 18));
    }
}
