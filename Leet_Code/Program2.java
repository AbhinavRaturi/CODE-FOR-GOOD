package Leet_Code;

public class Program2 {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        boolean result = true;
        if (s.length() != t.length()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            int index = (int) c;
            arr1[index]++;
        }

        for (char c : t.toCharArray()) {
            int index = (int) c;
            arr2[index]++;
        }
        for (int i = 0; i < 256; i++) {
            if (arr1[i] != arr2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}