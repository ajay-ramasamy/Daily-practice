//! find first missing number
package GFG;

import java.util.Arrays;

class Solution7 {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int max = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]>0 && max>=arr[i]-1){
                max = arr[i];
            }
        }
        return max+1;
        
    }
    
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        System.out.println(sol.missingNumber(new int[]{1,2,0}));
        System.out.println(sol.missingNumber(new int[]{3,4,-1,1}));
        System.out.println(sol.missingNumber(new int[]{7,8,9,11,12}));
    }
}
