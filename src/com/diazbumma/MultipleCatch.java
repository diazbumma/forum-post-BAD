package com.diazbumma;

import java.util.Scanner;

public class MultipleCatch {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {3, 5, 8, 2, 10, 0};

        try {
            System.out.println("Enter index 0 - 4:");
            int val = a[scanner.nextInt()];
            System.out.println("Enter divisor:");
            int dividedBy = scanner.nextInt();
            System.out.println("Result= " + (val/dividedBy));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Division error: " + e);
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        } finally {
            scanner.close();
            System.out.println("Scanner is now closed.");
        }
    }
}
