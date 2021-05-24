// https://leetcode.com/problems/sort-array-by-parity-ii/
package Leet_Code;

public class Program922 {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 7 };
        Solution5 sol = new Solution5();
        nums = sol.sortArrayByParityII(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

    }
}

class Solution5 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] TempArr = new int[nums.length];
        int j = 0, k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                TempArr[j] = nums[i];
                j = j + 2;
            } else {
                TempArr[k] = nums[i];
                k = k + 2;
            }
        }
        return TempArr;
    }
}