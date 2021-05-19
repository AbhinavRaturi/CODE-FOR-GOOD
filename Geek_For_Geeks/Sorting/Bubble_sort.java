package Sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 4, 2, 0 };
        arr = sorting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sorting(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted)
                break;
        }
        return arr;
    }
}
