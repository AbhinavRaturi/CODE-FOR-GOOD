package Sorting;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 2, 7, 1, 5, 3 };
        arr = QuickSort(0, arr.length - 1, arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] QuickSort(int l, int h, int[] arr) {
        if (l < h) {
            int Pivot = Partition(l, h, arr);
            QuickSort(l, Pivot - 1, arr);
            QuickSort(Pivot + 1, h, arr);
        }
        return arr;
    }

    public static int Partition(int l, int h, int[] arr) {
        int Pivot = arr[l];
        int i = l, j = h;
        while (i < j) {
            while (arr[i] <= Pivot)
                i++;
            while (arr[j] > Pivot)
                j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
