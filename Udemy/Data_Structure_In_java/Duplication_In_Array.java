package Udemy.Data_Structure_In_java;

import java.util.Arrays;

public class Duplication_In_Array {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 2, 2, 3, 4, 2 };
        long x = System.currentTimeMillis();
        Arrays.sort(arr);
        int check = arr[0];
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == check)
                counter++;
            if (arr[i] != check) {
                if (counter > 0) {
                    System.out.println(check);
                    counter = 0;
                }
                check = arr[i];
            }
        }
        System.out.println(System.currentTimeMillis() - x);
    }
}
