// ! 8 4 1 5 9 2
// 4 8 1 5 9 2
// 1 4 8 5 9 2
// 1 4 5 8 9 2
// 1 2 4 5 8 9

package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 1, 5, 9, 2 };
        arr = sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
