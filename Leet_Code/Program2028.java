package Leet_Code;

import java.util.Arrays;

public class Program2028 {
    public static void main(String[] args) {
        int[] rolls = { 1, 5, 6 };
        Program2028 p = new Program2028();
        int[] result = p.missingRolls(rolls, 3, 4);
        Arrays.stream(result).forEach(x -> System.out.println(x));
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {

        int[] ans = new int[n];
        final int targetSum = (rolls.length + n) * mean;
        int missingSum = targetSum - Arrays.stream(rolls).sum();

        if (missingSum < n || missingSum > n * 6) {
            return new int[] {};
        }
        Arrays.fill(ans, missingSum / n);

        missingSum %= n;

        for (int i = 0; i < missingSum; ++i) {
            ++ans[i];
        }
        return ans;
    }
}
