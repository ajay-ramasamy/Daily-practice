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
}
