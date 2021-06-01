package Leet_Code;

public class Program20 {
    public static void main(String[] args) {
        String s = "(){()[]}";
        Solution20 sol = new Solution20();
        System.out.println(sol.isValid(s));
    }
}

class Solution20 {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] arr = new char[s.length()];
        int pointer = 0;
        arr[0] = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (arr[pointer] == '(' && s.charAt(i) == ')' || arr[pointer] == '[' && s.charAt(i) == ']'
                    || arr[pointer] == '{' && s.charAt(i) == '}') {
                arr[pointer] = '0';
                if (pointer > 0)
                    pointer--;

            } else {
                pointer++;
                arr[pointer] = s.charAt(i);
            }
        }
        if (pointer != 0 || arr[0] == ')' || arr[0] == '}' || arr[0] == ']')
            return false;

        return true;
    }
}