package Geek_For_Geeks;

public class RecursivePalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        char[] sArray = s.toCharArray();
        RecursivePalindrome rPalindrome = new RecursivePalindrome();
        int startPoint = 0;
        int endPoint = sArray.length-1;
        System.out.println(rPalindrome.ispalindrome(sArray, startPoint, endPoint));
    }

    boolean ispalindrome(char[] arr, int startPoint, int endPoint){
        if(startPoint == endPoint)
            return true;
        if(arr[startPoint] != arr[endPoint])
            return false;
        return ispalindrome(arr, startPoint+1, endPoint-1);

    }
}
