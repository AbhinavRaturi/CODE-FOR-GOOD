package Leet_Code;

public class Program2520 {
    public int countDigits(int num) {
        int divisibleCount = 0;
        int iterateNum = num;
        while (iterateNum > 0) {
            int divNum = iterateNum % 10;
            if (num % divNum == 0) {
                divisibleCount++;
            }
            iterateNum = iterateNum / 10;
        }
        return divisibleCount;
    }
}
