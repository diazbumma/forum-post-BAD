package com.diazbumma;

public class Varargs {

    static String makeSentence(String ...words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String item: words) {
            stringBuilder.append(item);
            stringBuilder.append(" ");
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(".");

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeSentence("and", "I", "am", "Iron", "Man"));
    }
}
