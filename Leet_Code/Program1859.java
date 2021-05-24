package Leet_Code;

public class Program1859 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "is2 sentence4 This1 a3";
        System.out.println(sol.sortSentence(s));

    }

}

class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] arr1 = new String[arr.length];
        for (String val : arr) {
            int index = Integer.parseInt(val.substring(val.length() - 1, val.length()));
            arr1[index - 1] = val.substring(0, val.length() - 1);
        }
        s = "";
        for (int i = 0; i < arr.length - 1; i++) {
            s += arr1[i] + " ";
        }
        s += arr1[arr.length - 1];
        return s;
    }
}