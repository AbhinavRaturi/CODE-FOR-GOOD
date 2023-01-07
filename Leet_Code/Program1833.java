package Leet_Code;

import java.util.Arrays;

public class Program1833 {
    public static void main(String[] args) {
        Solution1833 s = new Solution1833();
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(s.maxIceCream(costs, coins));
    }
}
class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int  counter = 0;
        for(int i: costs){
            coins = coins -i;
            if(coins<0)
                break;
            else
                counter++;
        }
        return counter;
    }
}
//  1, 2, 2, 4
// 7-1 = 6, 6-2= 4,4-2=2, 2-4 = -2