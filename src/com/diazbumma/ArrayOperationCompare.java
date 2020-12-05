package com.diazbumma;

import java.util.Arrays;

public class ArrayOperationCompare {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        
        //int[] arr2 = {1, 3, 2};
        //int[] arr2 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.equals(arr1, arr2) ? "Sama" : "Tidak Sama");
    }
}
