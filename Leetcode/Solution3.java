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
    
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.earliestTimeToFinish(new int[][]{{3,2,4},{1,1,3},{2,4,2}}));
        System.out.println(sol.earliestTimeToFinish(new int[][]{{5,2},{4,3},{3,1}}));
    }
}
