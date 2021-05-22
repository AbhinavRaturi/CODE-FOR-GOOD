package Leet_Code;

public class Program4 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        Solution1 sol = new Solution1();
        System.out.println(sol.hammingWeight(n));
    }
}

class Solution1 {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}