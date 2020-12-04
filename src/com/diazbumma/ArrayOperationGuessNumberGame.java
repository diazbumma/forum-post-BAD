package com.diazbumma;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperationGuessNumberGame {

    static int[] generateRandomNumbers(int maxVal, int minVal, int size) {
        int[] result = new int[size];

        int range = maxVal - minVal + 1;

        for (int i = 0; i < size; i++) {
            result[i] = (int)(Math.random() * range) + minVal;
        }

        Arrays.sort(result);

        return result;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Guess The Numbers Game");
        System.out.println("First, we need to generate random numbers.");

        System.out.println("Enter max value:");
        int max = scanner.nextInt();

        System.out.println("Enter min value:");
        int min = scanner.nextInt();

        System.out.println("Enter total of numbers:");
        int size = scanner.nextInt();

        int[] generatedNumbers = generateRandomNumbers(max, min, size);

        System.out.println("Now guess one of the numbers!");

        while (true) {
            System.out.println("The number:");
            int number = scanner.nextInt();
            int res = Arrays.binarySearch(generatedNumbers, number);
            if (res >= 0) {
                System.out.println("Congratulations! You just correctly guessed one of the number!");
                break;
            } else {
                System.out.println("Uh oh! You're not correct. Give Up? (y/n)");
                String yesNo = scanner.next();
                if (yesNo.equals("y"))
                    break;
            }
        }

        System.out.println("The numbers are:");
        System.out.println(Arrays.toString(generatedNumbers));

        scanner.close();
    }
}
