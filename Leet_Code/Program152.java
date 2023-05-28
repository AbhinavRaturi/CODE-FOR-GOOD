// 152. Maximum Product Subarray
package Leet_Code;

public class Program152 {
    public int maxProduct(int[] nums) {
        int prodPrefix = 1;
        int prodSuffix = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (prodPrefix == 0)
                prodPrefix = 1;
            if (prodSuffix == 0)
                prodSuffix = 1;
            prodPrefix *= nums[i];
            prodSuffix *= nums[nums.length - i - 1];
            max = Math.max(max, Math.max(prodPrefix, prodSuffix));
        }
        return max;
    }
}
