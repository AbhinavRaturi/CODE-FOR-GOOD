package Leet_Code;

import java.util.Arrays;

public class Program2022 {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3 };
        int[][] twoDArray = new Program2022().construct2DArray(original, 3, 1);
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] newArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            newArray[i] = Arrays.copyOfRange(original, i * n, i * n + n);
        }
        return newArray;

    }

}