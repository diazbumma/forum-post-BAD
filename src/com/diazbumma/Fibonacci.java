package com.diazbumma;

import java.util.Scanner;

public class Fibonacci {

    static int[] lookup = new int[200];

    static int fibo(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if (lookup[n] == 0) {
            lookup[n] = fibo(n-1) + fibo(n-2);
        }

        return lookup[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            System.out.print(fibo(i) + " ");
        }

        System.out.println();
    }
}
