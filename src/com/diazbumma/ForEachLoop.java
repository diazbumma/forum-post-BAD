package com.diazbumma;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 4, 9, 7, 8, 3, 2, 6, 4};
        int find = 2;
        int count = 0;

        for (int item: numbers) {
            if (item == find)
                ++count;
        }

        System.out.println("numbers found: " + count);
    }
}
