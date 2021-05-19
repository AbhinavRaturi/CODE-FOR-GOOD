//! 5 2 -1 6 3
// -1 2 5 6 3
// -1 2 5 6 3
// -1 2 3 6 5

package Sorting;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = { 5, 2, -1, 6, 3 };
        arr = Sorting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] Sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
