// 88. Merge Sorted Array
package Leet_Code;

import java.util.Arrays;

public class Program88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for(int  i =m;i<m+n;i++){
            nums1[i] = nums2[k++];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
}
