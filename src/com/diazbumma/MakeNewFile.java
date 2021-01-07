package com.diazbumma;

import java.io.File;

public class MakeNewFile {

    public static void main(String[] args) {
        try {
            String path = "D:\\Download\\";
            String fileName = "somefile.txt";
            File file = new File(path + fileName);
            if (file.createNewFile())
                System.out.println("Sukses. " + file.getPath());
            else
                System.out.println("File sudah ada.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
