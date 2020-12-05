package com.diazbumma;

import java.util.Arrays;

public class ArrayOperationsExtendArray {

    static class ExtendArray {
        int[] items = new int[10];
        int capacity = 10;
        int size = 0;

        void ensureEnoughCapacity() {
            if (size == capacity) {
                capacity += 10;
                items = Arrays.copyOf(items, capacity);
            }
        }

        void add(int n) {
            ensureEnoughCapacity();
            items[size++] = n;
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder("[");

            for (int i = 0; i < size; i++) {
                str.append(items[i]);
                if (i != size - 1)
                    str.append(", ");
            }

            str.append("]");

            return str.toString();
        }
    }

    static int generateRandomNumber(int maxVal, int minVal) {
        int range = maxVal - minVal + 1;

        return (int)(Math.random() * range) + minVal;
    }


    public static void main(String[] args) {
        ExtendArray arr = new ExtendArray();

        for (int i = 0; i < 10; i++) {
            arr.add(generateRandomNumber(20, 1));
        }
        System.out.println(arr.toString());

        for (int i = 0; i < 10; i++) {
            arr.add(generateRandomNumber(100, 50));
        }
        System.out.println(arr.toString());
    }
}
