package Leet_Code;

import java.util.HashMap;
import java.util.Map;

public class Program2244 {
    public static void main(String[] args) {
        int[] tasks = {2,3,3};
        Solution2244 s = new Solution2244();
        System.out.println(s.minimumRounds(tasks));
    }
}
class Solution2244 {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> taskSet = new HashMap<>();
        for(int i: tasks){
            if(taskSet.containsKey(i)){
                int n = taskSet.get(i);
                n=n+1;
                taskSet.put(i, n);
                
            }
            else{
                taskSet.put(i, 1);
            }
        }
        int counter = 0;
        for(Map.Entry<Integer, Integer> m: taskSet.entrySet()){     
            int val = m.getValue();
            
            if(val == 1){
                return -1;
            }
            while(val>0){
                if(val == 1){
                    return -1;
                }
                if(val-3>2 || val-3==0){
                    val-=3;
                    counter++;
                }
                else{
                    val-=2;
                    counter++;
                }
            }
        }
        return counter;
    }
}