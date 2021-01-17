package com.diazbumma;

import java.util.Scanner;

public class FinallyBlock {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int[] a = {3, 5, 8, 2, 10};

        try {
            System.out.println("Enter index 0 - 4:");
            System.out.println("Elemen: " + a[scanner.nextInt()]);
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        } finally {
            scanner.close();
            System.out.println("Scanner is now closed.");
        }
    }
}
