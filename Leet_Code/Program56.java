// 56. Merge Intervals
package Leet_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        List<List<Integer>> mergeList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (mergeList.isEmpty() || intervals[i][0] > mergeList.get(mergeList.size() - 1).get(1)) {
                mergeList.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                mergeList.get(mergeList.size() - 1).set(1,
                        Math.max(mergeList.get(mergeList.size() - 1).get(1), intervals[i][1]));
            }
        }
        int[][] arr = mergeList.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        return arr;
    }
}
