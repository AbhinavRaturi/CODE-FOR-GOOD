package Leet_Code;

public class Program42 {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        Solution6 sol = new Solution6();
        System.out.println(sol.trap(height));
    }
}

class Solution6 {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int left = 0, right = 0, sum = 0;
        while (i < j) {
            left = Math.max(left, height[i]);
            right = Math.max(right, height[j]);
            if (left <= right) {
                sum += left - height[i];
                i++;
            } else {
                sum += right - height[j];
                j--;
            }
        }
        return sum;
    }
}