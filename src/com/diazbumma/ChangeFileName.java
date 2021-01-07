package com.diazbumma;

import java.io.File;

public class ChangeFileName {

    public static void main(String[] args) {
        try {
            String path = "D:\\Download\\";
            String oldFileName = "somefile.txt";
            String newFileName = "newFile.txt";

            File file = new File(path + oldFileName);

            if (file.renameTo(new File(path + newFileName)))
                System.out.println("Sukses. " + file.getPath());
            else
                System.out.println("File tidak ada.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
