package Leet_Code;

public class Program944 {
    public static void main(String[] args) {
        String[] s = {"abc", "bce", "cae"};
        Solution944 sol = new Solution944();
        System.out.println(sol.minDeletionSize(s));
    }
}
class Solution944 {
    public int minDeletionSize(String[] strs) {
        final int n = strs[0].length();
        int ans = 0;

        for (int j = 0; j < n; ++j){
            for (int i = 0; i + 1 < strs.length; ++i){
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                ++ans;
                break;
                }
            }
        }
    return ans;
    }
}