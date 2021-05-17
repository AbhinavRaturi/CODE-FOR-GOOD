class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int XorVal = nums[0];
        for (int i = 1; i < n; i++) {
            XorVal ^= nums[i];
        }
        return XorVal;

    }
}