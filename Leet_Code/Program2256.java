// Code Link: https://leetcode.com/problems/minimum-average-difference/
package Leet_Code;

public class Program2256 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4,6};
        int result = s.minimumAverageDifference(nums);
        System.out.println(result);   
    }

}
class Solution {
    public int minimumAverageDifference(int[] nums) {
        int l = nums.length;  
        int index = 0;
        long min = Integer.MAX_VALUE, sum = 0, leftsum = 0, rightsum = 0;
        for (int j = 0; j < l; j++) {
            sum = sum + nums[j];
        }
        for (int i = 0; i < l; i++) {
            leftsum += nums[i];
            rightsum = sum - leftsum;
            long diff = Math.abs(leftsum / (i + 1) - (l - i == 1 ? 0 : rightsum / (l - i - 1)));  // if number of rightsum values = 0
            if (diff < min) {
                min = diff;
                index = i;
            }
        }
        return index;

    }
}
