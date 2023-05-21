public class Program31 {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            for (int i = 0; i < (nums.length / 2); i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = temp;
            }
        } else {
            for (int i = nums.length - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            int k = 0;
            for (int i = index + 1; i < (nums.length + index + 1) / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - k - 1];
                nums[nums.length - k - 1] = temp;
                k += 1;
            }
        }
    }
}
