package Leet_Code;

public class Program70 {
    public static void main(String[] args) {
        int n = 5;
        Solution70 s = new Solution70();
        System.out.println(s.climbStairs(n));
    }
}

class Solution70 {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }

        int first = 1;
        int second = 2;
        int tmp = 0;

        for (int i = 3; i <= n; i++) {
            tmp = second;
            second += first;
            first = tmp;
        }
        return second;

    }

}