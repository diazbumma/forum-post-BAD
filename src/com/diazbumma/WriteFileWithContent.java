package com.diazbumma;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileWithContent {

    public static void main(String[] args) {
        try {
            String path = "D:\\Download\\";
            String fileName = "snap.txt";

            BufferedWriter writer = new BufferedWriter(new FileWriter(path + fileName));

            writer.write("I am Iron Man");
            writer.close();

            System.out.println("Sukses.");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
