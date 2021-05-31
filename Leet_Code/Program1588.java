package Leet_Code;

class Program1588 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        Solution1588 s = new Solution1588();
        System.out.println(s.sumOddLengthSubarrays(arr));
    }
}

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