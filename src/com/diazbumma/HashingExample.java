package com.diazbumma;

import java.util.Hashtable;
import java.util.Scanner;

public class HashingExample {

    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> pair = new Hashtable<>();
        for (String item: magazine) {
            if (pair.containsKey(item))
                pair.put(item, pair.get(item) + 1);
            else
                pair.put(item, 1);
        }
        //System.out.println(pair);
        for (String item: note) {
            if (pair.containsKey(item)) {
                if (pair.get(item) == 1) {
                    pair.remove(item);
                } else {
                    pair.put(item, pair.get(item) - 1);
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
