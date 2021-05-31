package Leet_Code;

class Program1588 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        Solution1588 s = new Solution1588();
        System.out.println(s.sumOddLengthSubarrays(arr));
    }
}

/*
 * index 0 1 2 3 4
 * 
 * val 1 4 2 5 3
 * 
 * start 5 4 3 2 1
 * 
 * end 1 2 3 4 5
 * 
 * tot(start*end) 5 8 9 8 5
 * 
 * odd 3 4 5 4 3
 * 
 * sum(odd*val) 3 16 10 20 9 = 58
 * 
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