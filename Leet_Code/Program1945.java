package Leet_Code;

public class Program1945 {
    public int getLucky(String s, int k) {
        String numString = "";
        for (char c : s.toCharArray()) {
            int temp = (int) c - 96;
            numString = numString + temp;
        }
        return numIterate(numString, k);
    }

    public int numIterate(String s, int k) {
        if (k == 0) {
            return Integer.parseInt(s);
        }
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += (int) c - 48;
        }
        return numIterate(String.valueOf(sum), k -= 1);
    }
}