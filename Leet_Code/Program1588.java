package Leet_Code;

public class Program1588 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        Solution1588 s = new Solution1588();
        System.out.println(s.sumOddLengthSubarrays(arr));
    }
}
/*
        arr val         1  4  2  5  3
        arr index       0  1  2  3  4  
        startindex      5  4  3  2  1   (no of sub array start with that particular index [e.g.- {0},{0,1},...)
        endindex        1  2  3  4  5   (no of sub array end with that particular index [e.g.- {2},{1,2},{0,1,2})
     total(start*end)   5  8  9  8  5   (this will give you the total number of sub array form)
        odd             3  4  5  4  3   (if total is {odd then total/2 +1} else total/2})
*/
class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length, sum = 0;
        for (int i = 0; i < len; i++) {
            int start = i + 1;
            int end = len - i;
            int total = start * end;
            int odd = total / 2;
            if (total % 2 == 1)
                odd++;
            sum += odd * arr[i];
        }
        return sum;
    }
}