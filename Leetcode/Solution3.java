package Leetcode;

//! 3683. Earliest Time to Finish One Task

public class Solution3 {
    public int earliestTimeToFinish(int[][] tasks) {
        int n = tasks.length;
        int m = tasks[0].length;
        int val = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum += tasks[i][j];
            }
            val = Math.min(val,sum);
        }
        return val;
    }
}
