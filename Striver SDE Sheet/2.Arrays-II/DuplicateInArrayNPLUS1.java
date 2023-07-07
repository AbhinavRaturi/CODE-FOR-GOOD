class DuplicateInArrayNPLUS1 {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 3, 2, 5 };
        System.out.println("The duplicate element is: " + new DuplicateInArrayNPLUS1().findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}