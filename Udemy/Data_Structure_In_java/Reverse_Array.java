package Udemy.Data_Structure_In_java;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
