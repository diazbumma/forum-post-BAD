package com.diazbumma;

public class CamelCase {

    // make method to analyze how many words in camel case format
    // it is guaranteed if the camel case starts in lowercase
    static int wordsInCamelCase(String str) {
        if (str.length() == 0)
            return 0;

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
                ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(wordsInCamelCase("dontForgetToSaveBeforeExit")); // output 6
        System.out.println(wordsInCamelCase("iAmIronMan")); // outputs 4
    }
}
