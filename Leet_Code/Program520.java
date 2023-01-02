package Leet_Code;

public class Program520 {
    public static void main(String[] args) {
        Solution520 s = new Solution520();
        System.out.println(s.detectCapitalUse("Usa"));
    }
}

class Solution520 {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(Character.isUpperCase( word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}