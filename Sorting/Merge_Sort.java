package Sorting;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 2, 7, 1, 5, 3 };
        System.out.println("hello");
        MergeSort(0, arr.length - 1, arr);
        display1(arr);
    }

    public static void MergeSort(int l, int r, int[] arr) {
        if (l < r) {
            int mid = (l + r) / 2;
            MergeSort(l, mid, arr);
            MergeSort(mid + 1, r, arr);
            Merge(arr, l, mid, r);
        }
    }

    public static void Merge(int[] arr, int l, int mid, int r) {
        int[] arr1 = new int[arr.length];
        int i = l, j = mid + 1, k = l;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                arr1[k] = arr[i];
                i++;
                k++;
            } else {
                arr1[k] = arr[j];
                j++;
                k++;
            }
        }
        if (i > mid) {
            while (j <= r) {
                arr1[k] = arr[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                arr1[k] = arr[i];
                i++;
                k++;
            }
        }
        for (int val = 0; val < arr1.length; val++) {
            arr[val] = arr1[val];
        }
    }

    public static void display1(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
