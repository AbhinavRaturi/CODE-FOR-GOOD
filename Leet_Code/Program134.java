package Leet_Code;

public class Program134 {
    public static void main(String[] args) {
        Solution134 s = new Solution134();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(s.canCompleteCircuit(gas, cost));
    }
}
class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGasSum = 0, totalCostSum = 0;
        for(int i: gas){
            totalGasSum += i;
        }
        for( int i : cost){
            totalCostSum += i;
        }
        if(totalGasSum< totalCostSum)
            return -1;
        int currentPosition = 0, startPostion = 0;
        for(int i = 0; i< gas.length;i++){
            currentPosition += (gas[i]- cost[i]);
            if(currentPosition< 0){
                startPostion = i+1;
                currentPosition = 0;
            }
        }
        return startPostion;
    }
}