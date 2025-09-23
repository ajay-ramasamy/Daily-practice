//! Two Sum - Pair with Given Sum
package GFG;

public class Solution8 {
    boolean twoSum(int arr[], int tar) {
        
        if(arr.length<2){
            return false;
        }
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum = arr[i];
            for(int j=i+1;j<n;j++){
                if(sum+arr[j]==tar){
                    return true;
                }
            }
        }
        return false;
        
    }
}
