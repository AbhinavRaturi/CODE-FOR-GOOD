package Leet_Code;

public class Program1470 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] nums = {1,1,2,2};
        Solution1470 s = new Solution1470();
        int n = 2;
        int[] result = s.shuffle(nums, n);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] nums_out = new int[nums.length];
        int k = 0;
        for(int i = 0;i<n;i++){
            nums_out[k++] = nums[i];
            nums_out[k++] = nums[n+i];
        }
        return nums_out;
    }
}