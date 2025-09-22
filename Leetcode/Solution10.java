//! House roober - 1

public class Solution10 {
    public int rob(int[] nums) {
        int  n = nums.length;
        if(n==1){return nums[0];}
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int h=2;h<n;h++){
            dp[h] = Math.max(dp[h-1],dp[h-2]+nums[h]);
        }
        return dp[n-1];
    }
    
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        System.out.println(sol.rob(new int[]{1,2,3,1}));
        System.out.println(sol.rob(new int[]{2,7,9,3,1}));
        System.out.println(sol.rob(new int[]{5}));
    }
}
